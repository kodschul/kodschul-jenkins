def call(Map config = [:]) {
    stage("Build") {
        echo "Build now, skipTests=${config.skipTests ?: false}"
    }
}