pipeline {
    agent any


    stages {
        stage("Logic") {
            steps {
                script {
                    def stage_var = "prod"

                    switch(stage_var) {
                        case "prod": echo "it is prod"; break 
                        case "dev": echo "it is dev"; break 
                        default: echo "no stage var"
                    }


                    for (i in 1..10) { echo "Run $i"}
                }
            }
        }
    }
}
