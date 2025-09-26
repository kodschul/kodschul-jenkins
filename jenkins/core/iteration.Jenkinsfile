pipeline {
    agent any

    stages {
        stage("Iterations") {
            steps {
                script {


                    def regions = ['eu', 'us', 'as']


                    // Display
                    regions.each { r -> echo "Region: ${r}"}

                    // Transform 
                    def regions_formatted = regions.collect { it.toUpperCase() }
                    regions_formatted.each { r -> echo "Formatted Region: ${r}"}


                    if (regions_formatted.contains("AF")){
                        echo "Region AF found"
                    } else{
                        echo "Region AF not found"
                    }
                }

            }
        }
    }
}
