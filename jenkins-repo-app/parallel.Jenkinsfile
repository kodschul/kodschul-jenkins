pipeline {
    agent any

    stages {
        stage('Parallel Build & Tests') {
            parallel {
                stage('Build') {
                    steps {
                        echo "Building..."
                        sh 'sleep 3'
                    }
                }
                stage('Unit Tests') {
                    steps {
                        echo "Running unit tests..."
                        sh 'sleep 2'
                    }
                }
                stage('Integration Tests') {
                    steps {
                        echo "Running integration tests..."
                        sh 'sleep 4'
                    }
                }
            }
        }
    }
}
