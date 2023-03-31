pipeline {
  agent any

  stages {
    stage('Spotless Apply') {
      steps {
        // Exécution de la tâche spotlessApply
        sh './gradlew spotlessApply'
        // Affichage des fichiers traités par Spotless
        sh 'echo "Spotless a traité les fichiers suivants:"'
        sh 'find . -name "*.java" | xargs ls -l'
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
