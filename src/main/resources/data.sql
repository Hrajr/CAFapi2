/* DROP TABLE IF EXISTS set_whiteCards;
DROP TABLE IF EXISTS set_blackCards;
DROP TABLE IF EXISTS blackCards;
DROP TABLE IF EXISTS whiteCards;
DROP TABLE IF EXISTS set;
DROP TABLE IF EXISTS CardModel;

CREATE TABLE blackCards (
    uuid INT AUTO_INCREMENT PRIMARY KEY,
    text VARCHAR(350) NOT NULL,
    childlike BOOLEAN NOT NULL,
    creatorName VARCHAR(250) DEFAULT NULL,
    createdAt DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL
);

INSERT INTO blackCards (id, text, childlike) VALUES
(1,'Terwijl je bezig bent met je AnimalShelter, komt je studiecoach ineens op je af en zegt {....}','TRUE')
,(2,'Je feedpulse staat open, snel maar invullen over {...}','TRUE')
,(3,'{...} is een goed excuus om je deadline niet te halen','TRUE')
,(4,'Het nieuwe Fontys gebouw R10 is echt te vergelijken met {...}','TRUE')
,(5,'Je beste maat komt erachter dat het koffieapparaat weer stuk is en zegt {...}','TRUE')
,(6,'{...} is het beste project wat ik ooit gedaan heb','TRUE')
,(7,'{...} is wat je zegt als je een docent op straat tegenkomt','TRUE')
,(8,'Semester niet gehaald, toch maar {...}','TRUE')
,(9,'De studentenkamer is druk bezig met {...}','TRUE')
,(10,'Komop Fontys, ik zit nog steeds te wachten op {...}','TRUE')
,(11,'Volgens mij gaat al mijn college geld naar {...}','TRUE')
,(12,'Wanneer je de english stream binnenstapt: {...}','TRUE')
,(13,'Je hebt je deadline niet gehaald, {....} is het enige wat je nog kan doen.','TRUE')
,(14,'Mijn comment in de code over {....} vergeten weg te halen...whoops.','TRUE')
,(15,'Net mijn feedback teruggekregen, ze waren heel enthousiast over {...}.','TRUE')
,(16,'Net heeft mijn docent {...} mij veel bijgeleerd.','TRUE')
,(17,'Wanneer Git weer een merge error geeft: {...}','TRUE')
,(18,'Frikandelbroodjes in de aanbieding! {...}','TRUE')
,(19,'Vandaag heeft Monique mij veel geleerd, namelijk {...}','TRUE')
,(20,'De opdrachtgever was het niet eens dat {...} in het project zat.','TRUE')
,(21,'Als je {....} goed kunt, mag je mee op wintersport!','TRUE')
,(22,'Als {..} af is ga ik koffie halen','TRUE')
,(23,'Fontys, {....}','TRUE')
,(24,'Maatje, {....}','TRUE')
,(25,'Wat is de enige reden dat je hier nog studeert?','TRUE')
,(26,'{...}, ik had ook naar de kroeg kunnen gaan','TRUE')
,(27,'Wat is de reden dat je ineens maatwerk moet doen?','TRUE')
,(28,'M''n laptop is weer kapot, dan maar {...}','TRUE')
,(29,'{...} komt in me op als ik over ICT denk.','TRUE')
,(30,'{...}, dus ik moet echt gaan','TRUE')
,(31,'Ineens kwam {...} in beeld terwijl ik aan het streamen was op MS Teams','TRUE')
,(32,'Mijn groepsleden zijn niet te bereiken, volgens mij zijn ze {...}','TRUE')
,(33,'Nieuw jaar begonnen, {...} had ik toch anders verwacht','TRUE')
,(34,'{...}, de bus weer gemist','TRUE')
,(35,'Volgens mij moet ik nog veel leren over {...}','TRUE')
,(36,'Grootste minpunt van thuiswerken.','TRUE')
,(37,'{...} Dat komt de volgende sprint wel.','TRUE')
,(38,'Wanneer je alleen maar PDF kan inleveren.','TRUE')
,(39,'De grootste reden dat je code weer niet werkt.','TRUE')
,(40,'Mijn studiecoach is ontslagen doordat ze {...} als een opdracht toevoegde','TRUE');

CREATE TABLE whiteCards (
    uuid INT AUTO_INCREMENT PRIMARY KEY,
    text VARCHAR(350) NOT NULL,
    childlike BOOLEAN NOT NULL,
    creatorName VARCHAR(250) DEFAULT NULL,
    createdAt DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL
);

INSERT INTO whiteCards (id, text, childlike) VALUES
(1, 'Je moet je muil houden','TRUE')
,(2,'Je moeder','TRUE')
,(3,'Dat staat op Canvas','TRUE')
,(4,'Gefontyst','TRUE')
,(5,'Sorry, ik ben maar een Media-student','TRUE')
,(6,'Fysiotherapie','TRUE')
,(7,'Zuipen in 040 café','TRUE')
,(8,'Broodjes bapao klaarmaken in de magnetron','TRUE')
,(9,'Kut, weer een deadline gemist','TRUE')
,(10,'Vul de feedpulse nog even in','TRUE')
,(11,'Zullen we maar springen?','TRUE')
,(12,'Youtube kijken tijdens een lecture','TRUE')
,(13,'Circustrein laten aftekenen door Bert','TRUE')
,(14,'Uitleg voor java van Onno','TRUE')
,(15,'Alexander vragen naar zijn favoriete bergpassen','TRUE')
,(16,'Ik heb er geen kracht meer voor','TRUE')
,(17,'Huilen is voor jou te laat','TRUE')
,(18,'Fontys memes uitprinten en op het prikbord hangen','TRUE')
,(19,'Blikjes energiedrank op de vensterbank verzamelen','TRUE')
,(20,'Frikandelbroodjes met energy','TRUE')
,(21,'Wortels halen bij de Albert Heijn','TRUE')
,(22,'Rare geluiden produceren bij sound design','TRUE')
,(23,'Feedbackmomentje met Luuk en Chris','TRUE')
,(24,'Tafelvoetballen','TRUE')
,(25,'Fontysteamuitje bij Enversed','TRUE')
,(26,'Je semester niet halen','TRUE')
,(27,'M''n laptop heeft geen webcam, helaas','TRUE')
,(28,'Maatwerk!','TRUE')
,(29,'Mijn familie valt in een risico groep','TRUE')
,(30,'Ah nee toch, weer mij concentratie verloren','TRUE')
,(31,'Is het al 4 uur?','TRUE')
,(32,'Was dat vandaag?','TRUE')
,(33,'Ik wil iedereen individueel spreken','TRUE')
,(34,'Komt de volgende sprint wel','TRUE')
,(35,'We hebben er helaas geen tijd voor gehad','TRUE')
,(36,'Mijn prioriteiten lagen ergens anders','TRUE')
,(37,'Kunnen we hier feedback op krijgen','TRUE')
,(38,'Wat waren de inloggevens ook alweer?','TRUE')
,(39,'Heeft iemand Wifi?','TRUE')
,(40,'Heb jij de laatste commit verpest?','TRUE')
,(41,'Afsluiten en opnieuw opstarten werkt altijd','TRUE')
,(42,'Steal like an artist','TRUE')
,(43,'Wie gaat er mee naar de winkel?','TRUE')
,(44,'Agile werkmethoden','TRUE')
,(45,'Retrospective met smarties','TRUE')
,(46,'Hizmet is echt goed','TRUE')
,(47,'Kapsalon met knoflooksaus','TRUE')
,(48,'Weekend','TRUE')
,(49,'ISSD verkoopt weer overpriced artikelen','TRUE')
,(50,'PSV moet vandaag voetballen','TRUE')
,(51,'Met veel pijn en moeite unit testen schrijven','TRUE')
,(52,'Error 404','TRUE')
,(53,'Ik mag mijn groepsgenoeten echt niet','TRUE')
,(54,'Snel de containervervoer opdracht afmaken','TRUE')
,(55,'Je algoritme klopt niet','TRUE')
,(56,'Fontys docenten die te lang pauze houden','TRUE')
,(57,'Dames op de ICT afdeling','TRUE')
,(58,'I''m going on an adventure!','TRUE')
,(59,'C#. Dat heb je toch nergens voor nodig.','TRUE')
,(60,'1000 errors...','TRUE')
,(61,'Eenrichtingsverkeer in R10','TRUE')
,(62,'Sodexo is failliet gegaan','TRUE')
,(63,'Portfolio afmaken','TRUE')
,(64,'Ik weet niet waarom, maar net deed alles het.','TRUE');


CREATE TABLE set (
    uuid INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);

INSERT INTO set (name) VALUES
    ('default'),
    ('childlike');

CREATE TABLE set_whiteCards (
    cardID INT,
    foreign key (cardID) references whiteCards (uuid),
    setID INT,
    foreign key (setID) references set (uuid)
);

INSERT INTO set_whiteCards (cardID, setID) VALUES
    ('1', '1'),
    ('2', '1');

CREATE TABLE set_blackCards (
    cardID INT,
    foreign key (cardID) references blackCards (uuid),
    setID INT,
    foreign key (setID) references set (uuid)
);

INSERT INTO set_blackCards (cardID, setID) VALUES
('1', '1'),
('2', '1');

SELECT w.*
FROM set_whiteCards sw
         INNER JOIN whiteCards w ON w.uuid = sw.cardID
WHERE sw.setID = 1;

SELECT b.*
FROM set_blackCards sb
         INNER JOIN blackCards b ON b.uuid = sb.cardID
WHERE sb.setID = 1; */