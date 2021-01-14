def call() {
    node {
        sh '''
            git version
            #docker version comment this until it works
            node --version
            npm version
        '''
    }
}