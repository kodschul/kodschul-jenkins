pipeline {
    agent any
    stages {
        stage('Login') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'user-pass-id', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                    sh 'echo "Logging in as $USER with password $PASS"'
                }
            }
        }
    }
}
