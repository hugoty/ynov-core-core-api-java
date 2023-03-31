pipeline {
  agent any

  stages {
    stage('Spotless Apply') {
      steps {
        // Exécution de la tâche spotlessApply
        bat './gradlew spotlessApply'
        // Affichage des fichiers traités par Spotless
        bat 'echo "Spotless a traité les fichiers suivants:"'
        bat 'dir /s /b *.java'
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
    stage('Archive Artifacts') {
      steps {
        archiveArtifacts artifacts: 'build/libs/*.jar', fingerprint: true
      }
    }

    stage('Publish to Nexus') {
      steps {
          bat './gradlew publish'
        }
      }
    }
  }

