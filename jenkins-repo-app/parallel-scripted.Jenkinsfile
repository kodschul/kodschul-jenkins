node {
    stage('Parallel Example') {
        parallel(
            Build: {
                sh 'echo "Building..."'
                sh 'sleep 5'
            },
            Test: {
                sh 'echo "Testing..."'
                sh 'sleep 3'
            },
            Deploy: {
                sh 'echo "Deploying..."'
                sh 'sleep 2'
            }
        )
    }
}
