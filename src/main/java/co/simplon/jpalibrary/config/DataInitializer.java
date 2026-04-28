package co.simplon.jpalibrary.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import co.simplon.jpalibrary.entity.BookEntity;
import co.simplon.jpalibrary.repository.BookRepository;

@Component
public class DataInitializer implements CommandLineRunner{

 private final BookRepository bookRepository;

 public DataInitializer(BookRepository bookRepositoryInjected) {
  this.bookRepository = bookRepositoryInjected;
 }

 @Override
 public void run(String... args) throws Exception {
  BookEntity lotr1 = new BookEntity("La Communauté de l'Anneau", "Frodon hérite d'un anneau maléfique de son oncle Bilbon. Guidé par Gandalf, il quitte la Comté avec ses amis pour détruire l'Anneau Unique avant qu'il ne tombe aux mains de Sauron.");
  BookEntity lotr2 = new BookEntity("Les Deux Tours", "Frodon hérite d'un anneau maléfique de son oncle Bilbon. Guidé par Gandalf, il quitte la Comté avec ses amis pour détruire l'Anneau Unique avant qu'il ne tombe aux mains de Sauron.");
  BookEntity lotr3 = new BookEntity("Le Retour du Roi", "La guerre de l'Anneau atteint son apogée. Tandis que le Gondor affronte les armées de Sauron, Frodon et Sam progressent vers la Montagne du Destin pour accomplir leur mission.");
  BookEntity belgariade1 = new BookEntity("Le Pion Prophétique", "Garion, un jeune orphelin, découvre qu'il est au cœur d'une ancienne prophétie. Entraîné dans un voyage par sa tante Pol et le mystérieux Loup, il comprend que son destin est immense.");
  BookEntity belgariade2 = new BookEntity("La Reine des Sortilèges", "Garion et ses compagnons pourchassent l'Orbe d'Aldur à travers des royaumes hostiles, affrontant espions, sorciers et complots politiques pour accomplir la prophétie.");
  BookEntity belgariade3 = new BookEntity("Le Gambit du Magicien", "La traque de l'Orbe se resserre. Garion maîtrise peu à peu ses pouvoirs tandis que le groupe s'aventure dans les terres des Murgos, au cœur du territoire ennemi.");
  BookEntity belgariade4 = new BookEntity("La Tour des Maléfices", "Garion et ses alliés affrontent Ctuchik, gardien de l'Orbe. L'affrontement décisif approche et Garion doit assumer son rôle de Suzerain des Anges au péril de sa vie.");
  BookEntity belgariade5 = new BookEntity("Le Choix d'un Dieu", "L'heure de la confrontation avec le dieu Torak est venue. Garion, armé de l'Orbe et d'une épée légendaire, doit accomplir la destinée inscrite dans la prophétie depuis des millénaires.");
  BookEntity passeMiroir1 = new BookEntity("Les Fiancés de l'Hiver", "Ophélie, capable de lire le passé des objets, est contrainte à des fiançailles avec le mystérieux Thorn. Elle quitte son Arche natale pour un monde inconnu où intrigues et dangers l'attendent.");
  BookEntity passeMiroir2 = new BookEntity("Les Disparus du Clairdelune", "Au Pôle, des nobles disparaissent mystérieusement. Ophélie se retrouve mêlée à une enquête périlleuse qui remet en question tout ce qu'elle croyait savoir sur ce monde.");
  BookEntity passeMiroir3 = new BookEntity("La Mémoire de Babel", "Ophélie se rend sur l'Arche de Babel à la recherche des origines des Arches et de la mystérieuse entité nommée Dieu. Sa quête révèle des secrets qui ébranlent l'ordre du monde.");
  BookEntity passeMiroir4 = new BookEntity("La Tempête des Échos", "Ophélie affronte la vérité sur Dieu et les Arches. Alors que le monde se fracture, elle doit faire des choix irréversibles pour sauver ce qui peut encore l'être.");
 
 
 this.bookRepository.save(lotr1);
 this.bookRepository.save(lotr2);
 this.bookRepository.save(lotr3);
 this.bookRepository.save(belgariade1);
 this.bookRepository.save(belgariade2);
 this.bookRepository.save(belgariade3);
 this.bookRepository.save(belgariade4);
 this.bookRepository.save(belgariade5);
 this.bookRepository.save(passeMiroir1);
 this.bookRepository.save(passeMiroir2);
 this.bookRepository.save(passeMiroir3);
 this.bookRepository.save(passeMiroir4);
 
 }

 
}
