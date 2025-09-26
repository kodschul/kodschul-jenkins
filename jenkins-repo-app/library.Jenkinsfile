@Library('my-local-lib') _ 
pipeline {
    agent any 
    stages {
        stage("Compile") {
            steps {
                buildStep(skipTests: true)
            }
        }
    }
}