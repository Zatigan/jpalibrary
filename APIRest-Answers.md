# SpringBoot et API

## - Qu'est-ce qu'une entité ?
C'est une class Java qui représente une table de notre base de données. De cette façon, chaque instance de cette class correspondra à une ligne de cette table.

## - Qu'est-ce qu'une architecture multicouche ?
Une architecture multicouche est un modèle de conception qui divise le code est plusieurs class. Chaque class a un rôle spécifique et intervient à un moment donné dans le traitement d'une requête. Cela permet de décomposer la logique métier, de faciliter la réutilisation et de faciliter les modifications du système ultérieurement.

## - Comment mettre en place une architecture multicouche avec Spring Boot ?
Pour réaliser la mise en place d'une architecture multicouche avec Sprint Boot, il faut commencer par créer l'arborescence adéquat. Classiquement, cela passe par 4 dossiers : controller, service, repository, model.
Chacun des dossiers va accueillir un ou plusieurs fichiers selon les besoins de notre projet. Le nom des fichiers précisera l'élément concerné et reprendra le nom du dossier : EmployeeEntity pour le modèle de base de données d'un employé par exemple.