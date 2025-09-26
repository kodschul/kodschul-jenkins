pipeline {
    agent any
    parameters {
        // string(name: 'USERNAME', defaultValue: 'guest', description: 'Enter your username')
        choice(name: 'ENV', choices: ['dev', 'staging', 'prod'], description: 'Choose environment')
        // booleanParam(name: 'DEBUG', defaultValue: false, description: 'Enable debug mode?')
    }
    stages {
        stage("Show Params") {
            steps {
                // echo "USERNAME = ${params.USERNAME}"
                echo "ENV = ${params.ENV}"
                // echo "DEBUG = ${params.DEBUG}"

                script {
                    echo "${params}"
                }
            }
        }
    }
}
