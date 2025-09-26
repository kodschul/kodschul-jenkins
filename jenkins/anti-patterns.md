# Jenkins Pipeline Anti-Patterns to Avoid

1. **Monolithic Stages**

   ```groovy
   // Bad: One giant stage doing everything
   stage('Build and Deploy') {
       steps {
           sh './build.sh'
           sh './test.sh'
           sh './deploy.sh'
       }
   }

   // Good: Break into smaller, focused stages
   stage('Build') {
       steps {
           sh './build.sh'
       }
   }
   stage('Test') {
       steps {
           sh './test.sh'
       }
   }
   stage('Deploy') {
       steps {
           sh './deploy.sh'
       }
   }
   ```

2. **Hardcoding Credentials**

   ```groovy
   // Bad: Hardcoded credentials
   sh 'curl -u admin:password https://example.com'

   // Good: Use Jenkins credentials
   withCredentials([usernamePassword(credentialsId: 'my-creds', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
       sh 'curl -u $USER:$PASS https://example.com'
   }
   ```

3. **Ignoring Error Handling**

   ```groovy
   // Bad: No error handling
   sh './deploy.sh'

   // Good: Add error handling
   try {
       sh './deploy.sh'
   } catch (Exception e) {
       echo "Deployment failed: ${e}"
       currentBuild.result = 'FAILURE'
   }
   ```

4. **Overusing Script Blocks**

   ```groovy
   // Bad: Unnecessary script blocks
   stage('Example') {
       steps {
           script {
               echo 'Step 1'
           }
           script {
               echo 'Step 2'
           }
       }
   }

   // Good: Consolidate steps
   stage('Example') {
       steps {
           echo 'Step 1'
           echo 'Step 2'
       }
   }
   ```

5. **Not Using Parallel Execution**

   ```groovy
   // Bad: Sequential execution when parallel is possible
   stage('Tests') {
       steps {
           sh './unit-tests.sh'
           sh './integration-tests.sh'
       }
   }

   // Good: Use parallel execution
   stage('Tests') {
       parallel {
           stage('Unit Tests') {
               steps {
                   sh './unit-tests.sh'
               }
           }
           stage('Integration Tests') {
               steps {
                   sh './integration-tests.sh'
               }
           }
       }
   }
   ```

6. **Ignoring Cleanup**

   ```groovy
   // Bad: No cleanup
   stage('Deploy') {
       steps {
           sh './deploy.sh'
       }
   }

   // Good: Add post actions
   post {
       always {
           sh './cleanup.sh'
       }
   }
   ```

7. **Overly Complex Conditions**

   ```groovy
   // Bad: Complex nested conditions
   if (env.BRANCH_NAME == 'main') {
       if (params.DEPLOY == true) {
           if (currentBuild.result == 'SUCCESS') {
               sh './deploy.sh'
           }
       }
   }

   // Good: Simplify conditions
   when {
       allOf {
           branch 'main'
           expression { params.DEPLOY == true }
           expression { currentBuild.result == 'SUCCESS' }
       }
   }
   steps {
       sh './deploy.sh'
   }
   ```
