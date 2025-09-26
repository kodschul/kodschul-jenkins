pipeline {
    agent any

    environment {
        MY_ENV_VAR = "Hello World"
    }

    stages {
        stage("Example") {
            steps {
                script {
                    def myVar = "Groovy Variable"
                    def config = [owner: "dev-team", retries: 3]

                    echo "Env Var: ${env.MY_ENV_VAR}"
                    echo "Local Var: ${myVar}"

                    echo "Retries set to ${config.retries}"  // prints: 3
                    echo "Owner is ${config['owner']}"
                }
            }
        }
    }
}
