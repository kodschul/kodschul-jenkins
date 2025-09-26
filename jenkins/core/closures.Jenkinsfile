pipeline {
    agent any


    stages {
        stage("Closures") {
            steps {
                script {
                    def elements = ['el1', 'el2', 'el3', 'el4']

                    // func code block 
                    def my_printer = { el -> echo  ">> ${el}"}

                    my_printer("Print custom")
                    my_printer(elements[0])

                    // each iterator 
                    elements.each { my_printer(it) } 
                    ['abc', 'def'].each { my_printer(it) }

                }
            }
        }
    }
}
