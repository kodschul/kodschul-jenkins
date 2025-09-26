pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                retry(2) {
                    sh 'test-abc'
                }
            }
        }
    }
    post {
        success {
            echo 'Pipeline completed successfully'
        }
        failure {
            echo 'Pipeline failed'
        }
    }
}
