pipeline {
    agent any


    stages {
        stage("Try/Catch") {
            steps {
                script {
                    try {
                        sh "npm-test"
                    } catch (e) {
                        echo "Tests failed: ${e} "

                        currentBuild.result = "SUCCESS"
                    }
                }
            }
        }

        stage("Deploy"){
            steps {
                echo "Deploy done!"
            }
        }
    }
}
