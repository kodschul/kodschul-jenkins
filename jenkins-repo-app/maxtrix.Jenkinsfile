    pipeline {
        agent any
        stages {
            stage('Matrix Build') {
                matrix {
                    axes {
                        axis {
                            name 'PLATFORM'
                            values 'linux', 'windows', 'mac'
                        }
                        axis {
                            name 'BROWSER'
                            values 'chrome', 'firefox', 'safari'
                        }
                    }
                    stages {
                        stage('Build and Test') {
                            steps {
                                echo "Building for ${PLATFORM} with ${BROWSER}..."
                                echo "Testing on ${PLATFORM} with ${BROWSER}..."
                            }
                        }
                    }
                }
            }
        }
        post {
            success {
                echo 'Matrix pipeline completed successfully'
            }
            failure {
                echo 'Matrix pipeline failed'
            }
        }
    }