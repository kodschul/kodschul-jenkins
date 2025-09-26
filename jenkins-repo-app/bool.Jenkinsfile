pipeline {
    agent any
    
    stages {
        stage('Build only on main') {
            steps {
                script {
                    if (env.BRANCH_NAME == 'main') {
                        echo 'This is the main branch'
                    } else {
                        echo 'This is not the main branch'
                    }
                }
            }
        }

        stage('Deploy') {
            when { branch 'prod'}
            steps {
                echo "Deploy to production"
            }
        }
    }
}
