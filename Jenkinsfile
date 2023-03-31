pipeline {
  agent any

  stages {
    stage('Spotless Apply') {
      steps {
        // Exécution de la tâche spotlessApply
        bat './gradlew spotlessApply'
        // Affichage des fichiers traités par Spotless
        bat 'echo "Spotless a traité les fichiers suivants:"'
        bat 'find . -name "*.java" | xargs ls -l'
      }
    }

    stage('Gradle Build') {
      steps {
        // Exécution de la vérification Spotless
        bat './gradlew spotlessCheck'

        // Compilation du code
        bat './gradlew clean build'
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
