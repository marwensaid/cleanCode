Refactoring et Tests d'une Application Spring Boot Mal Écrite

#### **Introduction**
Ce TD a pour but de mettre en pratique vos compétences de refactoring, de respect des bonnes pratiques de codage, et d'écriture de tests unitaires et d'intégration. Vous allez travailler sur une application Java Spring Boot existante, mais mal écrite, qui ne respecte pas les conventions de programmation (code spaghetti, noms de variables peu explicites, absence de commentaires, etc.). L'application est également mal testée, ce qui se traduit par un mauvais indice SonarQube (faible couverture de tests, duplication de code, code non conforme aux standards de qualité).

Votre mission est de :
1. Refactorer le code pour qu'il respecte les bonnes pratiques de développement.
2. Ajouter des tests unitaires et d'intégration pour améliorer la couverture de tests.
3. Améliorer l'indice SonarQube en corrigeant les problèmes de qualité de code.

---

#### **Contexte et Description de l'Application**
L'application est un **système de gestion des tâches** (Task Management System). Elle permet de :
1. Créer une tâche.
2. Récupérer toutes les tâches.
3. Mettre à jour une tâche.
4. Supprimer une tâche.
5. Rechercher une tâche par son ID.

Le code contient les problèmes suivants :
- Les noms de classes, méthodes et variables ne sont pas explicites.
- Les classes sont trop longues et contiennent plusieurs responsabilités (non-respect du **Single Responsibility Principle**).
- Le code contient des duplications inutiles.
- La logique métier est mélangée avec la couche contrôleur.
- Le code n'est pas formaté correctement (indentation incorrecte, absence de commentaires, etc.).
- Il n'y a aucun test unitaire ou d'intégration.

---

#### **Consignes**
1. **Refactoring** :
   - Respectez les principes SOLID (Single Responsibility, Open/Closed, Liskov, Interface Segregation, Dependency Injection).
   - Renommez les classes, méthodes et variables pour qu'elles soient explicites.
   - Déplacez la logique métier dans les services et laissez les contrôleurs uniquement gérer les requêtes HTTP.
   - Supprimez les duplications de code.
   - Ajoutez des commentaires utiles et reformatez le code pour le rendre lisible.

2. **Tests** :
   - Écrivez des tests unitaires en utilisant **Mockito** pour isoler la logique métier.
   - Écrivez des tests d'intégration pour tester les endpoints REST avec **MockMvc**.
   - Ajoutez des tests pour vérifier les cas limites et les erreurs.

3. **Amélioration de la Qualité** :
   - Corrigez les problèmes identifiés par SonarQube :
     - Augmentez la couverture de tests à **80% minimum**.
     - Réduisez les duplications de code.
     - Supprimez les blocs de code inutilisés ou obsolètes.



### **Travail attendu**

1. **Refactoring :**
   - Séparez la logique métier dans des services distincts.
   - Renommez les classes, méthodes et variables pour qu'elles soient compréhensibles.
   - Supprimez les duplications de code (par exemple, vérification des nulls).
   - Ajoutez des validations appropriées (par exemple, via des annotations comme `@NotNull`, `@Size`).

2. **Tests :**
   - Ajoutez des tests unitaires pour les méthodes du service (`addTask`, `getAll`, `updateTask`, etc.) avec Mockito.
   - Implémentez des tests d'intégration pour les endpoints REST avec MockMvc.
   - Couvrez les cas d'erreurs et les cas limites (par exemple, mise à jour d'une tâche inexistante).

3. **Amélioration de la Qualité :**
   - Augmentez la couverture de tests à **80% minimum**.
   - Réduisez les duplications de code et appliquez les principes SOLID.
   - Assurez-vous que le code est lisible, bien formaté et commenté.

### **Livrables**
- Code refactoré respectant les bonnes pratiques de programmation.
- Fichiers de tests unitaires et d'intégration.
- Rapport SonarQube montrant une amélioration de la qualité de code (80% de couverture minimum).

---

Bonne chance ! 😊
