pipeline {
  agent any

  stages {
    stage('Spotless Apply') {
      steps {
        // Exécution de la tâche spotlessApply
        sh './gradlew spotlessApply'
      }
    }

    stage('Gradle Build') {
      steps {
        // Exécution de la vérification Spotless
        sh './gradlew spotlessCheck'

        // Compilation du code
        sh './gradlew clean build'
      }
    }
  }
}

post {
  always {
    // Archivage des artefacts
    archiveArtifacts artifacts: 'build/libs/*.jar', fingerprint: true
  }
}
