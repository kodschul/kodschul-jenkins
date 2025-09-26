pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                timeout(time: 3, unit: "SECONDS") {
                    sh 'sleep 10'
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
