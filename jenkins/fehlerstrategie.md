1. **Retry Strategy**

   ```groovy
   retry(3) {
       sh './run-tests.sh'
   }
   ```

2. **Timeout Handling**

   ```groovy
   timeout(time: 10, unit: 'MINUTES') {
       sh './long-running-process.sh'
   }
   ```

3. **Error Notification**

   ```groovy
   post {
       failure {
           mail to: 'team@example.com',
                subject: "Build Failed - ${currentBuild.fullDisplayName}",
                body: "Check console output at ${BUILD_URL}"
       }
   }
   ```

4. **Conditional Execution**

   ```groovy
   when {
       expression { params.ENV == 'prod' }
   }
   steps {
       echo 'Running production-specific steps'
   }
   ```

5. **Cleanup on Failure**
   ```groovy
   post {
       always {
           sh './cleanup.sh'
       }
   }
   ```
