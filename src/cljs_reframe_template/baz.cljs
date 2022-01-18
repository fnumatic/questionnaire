(ns cljs-reframe-template.baz)

(def ddd
  {
   "title" "German",
   "pools" [
            {
             "id"       1,
             "chapters" [
                         {
                          "id"    1,
                          "title" "Stage 1",
                          "tasks" [
                                   {
                                    "id"       1,
                                    "question" "Hallo! Ich ______ Lisa Schmidt!",
                                    "option1"  "heißt",
                                    "option2"  "heiße",
                                    "option3"  "heißen",
                                    "option4"  "hieß",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       2,
                                    "question" "______ heißt du?",
                                    "option1"  "Wer",
                                    "option2"  "Wie",
                                    "option3"  "Was",
                                    "option4"  "Wo",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       3,
                                    "question" "Peters kleiner ______ heißt Paul.",
                                    "option1"  "Mutter",
                                    "option2"  "Vater",
                                    "option3"  "Bruder",
                                    "option4"  "Schwester",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       4,
                                    "question" "Ist das ______ Auto?",
                                    "option1"  "dir",
                                    "option2"  "dein",
                                    "option3"  "dich",
                                    "option4"  "die",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       5,
                                    "question" "Es ist 18:45 Uhr.",
                                    "option1"  "viertel vor sieben",
                                    "option2"  "viertel nach sieben",
                                    "option3"  "viertel vor neunzehn",
                                    "option4"  "dreiviertel neunzehn",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       6,
                                    "question" "Das Parlamentsgebäude steht ______ Berlin.",
                                    "option1"  "auf",
                                    "option2"  "in",
                                    "option3"  "zwischen",
                                    "option4"  "unter",
                                    "answer"   2,
                                    "selected" 0

                                    }
                                   ]
                          },
                         {
                          "id"    2,
                          "title" "Stage 2",
                          "tasks" [
                                   {
                                    "id"       7,
                                    "question" "Heute essen wir ______ Holger.",
                                    "option1"  "bei",
                                    "option2"  "nach",
                                    "option3"  "zu",
                                    "option4"  "im",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       8,
                                    "question" "Heute haben wir ______ Äpfel.",
                                    "option1"  "einen",
                                    "option2"  "eine",
                                    "option3"  "kein",
                                    "option4"  "keine",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       9,
                                    "question" "Gibst du ______ bitte das Buch?",
                                    "option1"  "mir",
                                    "option2"  "mich",
                                    "option3"  "mein",
                                    "option4"  "meine",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       10,
                                    "question" "Peter schläft in seinem ______.",
                                    "option1"  "Bett",
                                    "option2"  "Tisch",
                                    "option3"  "Badewanne",
                                    "option4"  "Stuhl",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       11,
                                    "question" "Gestern ______ sie alle im Kino.",
                                    "option1"  "war",
                                    "option2"  "warst",
                                    "option3"  "waren",
                                    "option4"  "wart",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       12,
                                    "question" "Christian ______ ein Auto.",
                                    "option1"  "kaufte",
                                    "option2"  "las",
                                    "option3"  "kochte",
                                    "option4"  "spielte",
                                    "answer"   1,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    3,
                          "title" "Stage 3",
                          "tasks" [
                                   {
                                    "id"       13,
                                    "question" "Die Tasche gehört ______ Mann.",
                                    "option1"  "dem",
                                    "option2"  "der",
                                    "option3"  "ihm",
                                    "option4"  "euch",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       14,
                                    "question" "Die Vase steht auf______Tisch.",
                                    "option1"  "ihrem",
                                    "option2"  "ihrer",
                                    "option3"  "ihre",
                                    "option4"  "ihr",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       15,
                                    "question" "Ich ______ keine Tomaten.",
                                    "option1"  "magst",
                                    "option2"  "mögen",
                                    "option3"  "mag",
                                    "option4"  "mögt",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       16,
                                    "question" "______ Sie weiter! Es gibt nichts zu sehen!",
                                    "option1"  "Geht",
                                    "option2"  "Gehen",
                                    "option3"  "Geh",
                                    "option4"  "Gehst",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       17,
                                    "question" "Er legt die CDs ______  Regal.",
                                    "option1"  "ins",
                                    "option2"  "im",
                                    "option3"  "in",
                                    "option4"  "auf",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       18,
                                    "question" "Horst kommt um 13:48 Uhr ______.",
                                    "option1"  "an",
                                    "option2"  "ab",
                                    "option3"  "auf",
                                    "option4"  "ein",
                                    "answer"   1,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    4,
                          "title" "Stage 4",
                          "tasks" [
                                   {
                                    "id"       19,
                                    "question" "______ Koffer ist das?",
                                    "option1"  "Wessen",
                                    "option2"  "Wer",
                                    "option3"  "Wem",
                                    "option4"  "Wen",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       20,
                                    "question" "Ist das ____ halb voll oder halb leer?",
                                    "option1"  "Glas",
                                    "option2"  "Becher",
                                    "option3"  "Pralinen",
                                    "option4"  "Zigarette",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       21,
                                    "question" "Ich habe dir doch ______, dass es so nicht geht!",
                                    "option1"  "gehört",
                                    "option2"  "gesagt",
                                    "option3"  "geduscht",
                                    "option4"  "gegesen",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       22,
                                    "question" "Warum ______ du mir nicht helfen?",
                                    "option1"  "dürft",
                                    "option2"  "will",
                                    "option3"  "wollen",
                                    "option4"  "kannst",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       23,
                                    "question" "Wir putzen ______ morgens die Zähne.",
                                    "option1"  "sie",
                                    "option2"  "sich",
                                    "option3"  "dich",
                                    "option4"  "uns",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       24,
                                    "question" "Das Haus gehört mir. Es ist ______.",
                                    "option1"  "meins",
                                    "option2"  "meiner",
                                    "option3"  "meine",
                                    "option4"  "mein",
                                    "answer"   1,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    5,
                          "title" "Stage 5",
                          "tasks" [
                                   {
                                    "id"       25,
                                    "question" "______ gehört der Ball?",
                                    "option1"  "Wem",
                                    "option2"  "Wer",
                                    "option3"  "Woher",
                                    "option4"  "Warum",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       26,
                                    "question" "Ich freue ______.",
                                    "option1"  "mich",
                                    "option2"  "sich",
                                    "option3"  "uns",
                                    "option4"  "euch",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       27,
                                    "question" "Es ist schön, euch ______.",
                                    "option1"  "zu sehen",
                                    "option2"  "seht",
                                    "option3"  "sahen",
                                    "option4"  "gesehen",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       28,
                                    "question" "Was machst du ______?",
                                    "option1"  "am Juli",
                                    "option2"  "im Montag",
                                    "option3"  "am Wochenende",
                                    "option4"  "im Freitag",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       29,
                                    "question" "Wir fahren ______ Ukraine.",
                                    "option1"  "in die",
                                    "option2"  "nach",
                                    "option3"  "in",
                                    "option4"  "in der",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       30,
                                    "question" "Das ist eine ______ Schlange.",
                                    "option1"  "groß",
                                    "option2"  "große",
                                    "option3"  "großer",
                                    "option4"  "großes",
                                    "answer"   2,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    6,
                          "title" "Stage 6",
                          "tasks" [
                                   {
                                    "id"       31,
                                    "question" "______ Film möchtest du sehen?",
                                    "option1"  "Welcher",
                                    "option2"  "Welche",
                                    "option3"  "Welches",
                                    "option4"  "Welchen",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       32,
                                    "question" "Die Insel hat ______ Sandstrand.",
                                    "option1"  "einen feinen",
                                    "option2"  "ein feines",
                                    "option3"  "eine feine",
                                    "option4"  "eine feinen",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       33,
                                    "question" "______ ich fliege, kaufe ich ein Ticket.",
                                    "option1"  "Während",
                                    "option2"  "Bevor",
                                    "option3"  "Nachdem",
                                    "option4"  "Wann",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       34,
                                    "question" "Gestern habe ich alleine ______.",
                                    "option1"  "abgewaschen",
                                    "option2"  "abwaschen",
                                    "option3"  "geabwaschen",
                                    "option4"  "gewaschen",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       35,
                                    "question" "Kaffee schmeckt mir gut, aber Tee schmeckt mir ______.",
                                    "option1"  "besser",
                                    "option2"  "guter",
                                    "option3"  "best",
                                    "option4"  "bessere",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       36,
                                    "question" "Ich brauche ein Buch ______ Lesen.",
                                    "option1"  "zum",
                                    "option2"  "um zu",
                                    "option3"  "zur",
                                    "option4"  "zu",
                                    "answer"   1,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    7,
                          "title" "Stage 7",
                          "tasks" [
                                   {
                                    "id"       37,
                                    "question" "Der Hund ______ gestreichelt.",
                                    "option1"  "werden",
                                    "option2"  "geworden",
                                    "option3"  "wird",
                                    "option4"  "wirst",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       38,
                                    "question" "Der Mann, ______ dort steht, ist groß.",
                                    "option1"  "der",
                                    "option2"  "die",
                                    "option3"  "das",
                                    "option4"  "den",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       39,
                                    "question" "Der Name ______ ist Paul.",
                                    "option1"  "des Kindes",
                                    "option2"  "das Kind",
                                    "option3"  "dem Kind",
                                    "option4"  "den Kind",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       40,
                                    "question" "Das muss solange kochen, ______ es fertig ist.",
                                    "option1"  "seit",
                                    "option2"  "sobald",
                                    "option3"  "solange",
                                    "option4"  "bis",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       41,
                                    "question" "Beim ______ Mal ging es schon besser.",
                                    "option1"  "zweiten",
                                    "option2"  "Zweite",
                                    "option3"  "Doppelte",
                                    "option4"  "zweifach",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       42,
                                    "question" "„Er ist jeden Tag in der Schule“. Sie sagt, er ______  jeden Tag in der Schule gewesen.",
                                    "option1"  "sei",
                                    "option2"  "waren",
                                    "option3"  "ist",
                                    "option4"  "war",
                                    "answer"   3,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    8,
                          "title" "Stage 8",
                          "tasks" [
                                   {
                                    "id"       43,
                                    "question" "______ hätte gerne ein schnelles Auto.",
                                    "option1"  "Mancher",
                                    "option2"  "Manche",
                                    "option3"  "Manches",
                                    "option4"  "Manch ein",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       44,
                                    "question" "Er zieht das ______ Hemd an.",
                                    "option1"  "gebügelte",
                                    "option2"  "gebügelt",
                                    "option3"  "gebügeltes",
                                    "option4"  "gebügelten",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       45,
                                    "question" "Er nimmt ______ der Konferenz teil.",
                                    "option1"  "an",
                                    "option2"  "mit",
                                    "option3"  "bei",
                                    "option4"  "um",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       46,
                                    "question" "Sie kaufte einen Hund, ______ sie nicht mehr alleine ist.",
                                    "option1"  "damit",
                                    "option2"  "desto",
                                    "option3"  "obwohl",
                                    "option4"  "so dass",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       47,
                                    "question" "Wir schauen ______ das Haus an.",
                                    "option1"  "uns",
                                    "option2"  "euch",
                                    "option3"  "für",
                                    "option4"  "über",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       48,
                                    "question" "Er war zufrieden ______ seiner Arbeit.",
                                    "option1"  "mit",
                                    "option2"  "nach",
                                    "option3"  "vor",
                                    "option4"  "auf",
                                    "answer"   1,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    9,
                          "title" "Stage 9",
                          "tasks" [
                                   {
                                    "id"       49,
                                    "question" "Wo liegt ______  alte Strohhut?",
                                    "option1"  "der",
                                    "option2"  "die",
                                    "option3"  "das",
                                    "option4"  "des",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       50,
                                    "question" "Herbert ist ______ besten Ärzte in der Stadt.",
                                    "option1"  "einer der",
                                    "option2"  "eine der",
                                    "option3"  "eins der",
                                    "option4"  "einen der",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       51,
                                    "question" "______ des Streiks werden keine Pakete ausgeliefert.",
                                    "option1"  "Wegen",
                                    "option2"  "Weil",
                                    "option3"  "Deswegen",
                                    "option4"  "Darum",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       52,
                                    "question" "Er hat beides:______ ein Auto ______ ein Motorrad.",
                                    "option1"  "Sowohl - als auch",
                                    "option2"  "Weder - noch",
                                    "option3"  "entweder - oder",
                                    "option4"  "Weder - oder",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       53,
                                    "question" "______ Baum steht hier seit 150 Jahren.",
                                    "option1"  "Dieser",
                                    "option2"  "Diese",
                                    "option3"  "Dieses",
                                    "option4"  "Diesen",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       54,
                                    "question" "Das Mittagessen war nichts ______.",
                                    "option1"  "Besonderes",
                                    "option2"  "besonders",
                                    "option3"  "besondere",
                                    "option4"  "besonderer",
                                    "answer"   1,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    10,
                          "title" "Stage 10",
                          "tasks" [
                                   {
                                    "id"       55,
                                    "question" "Der Finanzminister hat derzeit laut einer Umfrage die höchsten Beliebtheitswerte ______ Karriere.",
                                    "option1"  "sein ",
                                    "option2"  "seine",
                                    "option3"  "seiner",
                                    "option4"  "seinem",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       56,
                                    "question" "Hast du ______, was wir am Wochenende machen können?",
                                    "option1"  "einen Vorschlag",
                                    "option2"  "eine Absicht",
                                    "option3"  "eine Wahl",
                                    "option4"  "eine Aufgabe",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       57,
                                    "question" "Am Ende des Kurses ist eine Prüfung ______.",
                                    "option1"  "abzulegen",
                                    "option2"  "anzutreten",
                                    "option3"  "vorzunehmen",
                                    "option4"  "mitzunehmen",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       58,
                                    "question" "Wenn Du mit dem Zug von Rostock nach Lübeck willst, musst du zwischendurch einmal ______.",
                                    "option1"  "einsteigen",
                                    "option2"  "aussteigen",
                                    "option3"  "umsteigen",
                                    "option4"  "absteigen",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       59,
                                    "question" "Wir sind tagsüber ______ am Strand.",
                                    "option1"  "meistens",
                                    "option2"  "am meisten",
                                    "option3"  "mindestens",
                                    "option4"  "mehr",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       60,
                                    "question" "Die _____ beträgt 24 Monate.",
                                    "option1"  "Vertragslaufzeit",
                                    "option2"  "Vertragsabschluss",
                                    "option3"  "Provision",
                                    "option4"  "Vertragspartner",
                                    "answer"   1,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    11,
                          "title" "Stage  11",
                          "tasks" [
                                   {
                                    "id"       61,
                                    "question" "Man kann sehr naiv nach Panama ______.",
                                    "option1"  "anreisen",
                                    "option2"  "ankommen",
                                    "option3"  "aussteigen",
                                    "option4"  "absteigen",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       62,
                                    "question" "Wir haben gute Vertragskonditionen ______.",
                                    "option1"  "aushandeln können",
                                    "option2"  "absagen müssen",
                                    "option3"  "zusagen sollen",
                                    "option4"  "vorsagen dürfen",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       63,
                                    "question" "Wenn er die Abstimmung verliert, nimmt er seinen ______.",
                                    "option1"  "Hut",
                                    "option2"  "Schal",
                                    "option3"  "Stock",
                                    "option4"  "Dienstwagen",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       64,
                                    "question" "Häufig wollen Jugendliche ______ bleiben.",
                                    "option1"  "unter sich",
                                    "option2"  "miteinander",
                                    "option3"  "beieinander",
                                    "option4"  "für sich",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       65,
                                    "question" "Wenn es günstig sein soll, müsst ihr ______, dass es nicht die beste Qualität ist.",
                                    "option1"  "in Kauf nehmen",
                                    "option2"  "In Rechnung stellen",
                                    "option3"  "zum Kauf nehmen",
                                    "option4"  "auf Rechnung setzen",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       66,
                                    "question" "Am Wochenende fahren wir _____ Grüne!",
                                    "option1"  "ins",
                                    "option2"  "im",
                                    "option3"  "nach",
                                    "option4"  "in",
                                    "answer"   1,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    12,
                          "title" "Stage  12",
                          "tasks" [
                                   {
                                    "id"       67,
                                    "question" "Das war heute ______ nicht der letzte Strandtag?",
                                    "option1"  "hoffentlich",
                                    "option2"  "nämlich",
                                    "option3"  "öffentlich",
                                    "option4"  "darum",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       68,
                                    "question" "Der Politiker bedankte sich bei den Wählern ______ ihre Stimmen.",
                                    "option1"  "für",
                                    "option2"  "um",
                                    "option3"  "von",
                                    "option4"  "gegen",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       69,
                                    "question" "Schrecklich! Stell dir vor, ______ uns das passieren würde!",
                                    "option1"  "dass",
                                    "option2"  "der",
                                    "option3"  "das",
                                    "option4"  "die",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       70,
                                    "question" "Bevor er nach Deutschland kam ______ er ein Restaurant in seiner Heimat gehabt.",
                                    "option1"  "hat",
                                    "option2"  "hatte",
                                    "option3"  "haben",
                                    "option4"  "hatten",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       71,
                                    "question" "Unsere ______ vom Erdöl ist sehr groß.",
                                    "option1"  "Abhängigkeit",
                                    "option2"  "abhängig",
                                    "option3"  "unabhängig",
                                    "option4"  "Unabhängigkeit",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       72,
                                    "question" "Die Nacht war sehr warm. Es soll  die ______ Nacht des Jahres gewesen sein.",
                                    "option1"  "warme",
                                    "option2"  "wärmere",
                                    "option3"  "wärmste",
                                    "option4"  "warm",
                                    "answer"   3,
                                    "selected" 0
                                    }
                                   ]
                          }]
             },
            {

             "id"       2,
             "chapters" [
                         {
                          "id"    1,
                          "title" "Stage 1",
                          "tasks" [
                                   {
                                    "id"       1,
                                    "question" "Where are you from? I‘m _______________ Texas, USA.",
                                    "option1"  "come from",
                                    "option2"  "from",
                                    "option3"  "come",
                                    "option4"  "out",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       2,
                                    "question" "The Eiffel Tower is ________________ Paris. ",
                                    "option1"  "in",
                                    "option2"  "on",
                                    "option3"  "of",
                                    "option4"  "at",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       3,
                                    "question" "________________ is your new job like, Pierre? It’s fun.",
                                    "option1"  "Where",
                                    "option2"  "How",
                                    "option3"  "Who",
                                    "option4"  "What",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       4,
                                    "question" "This is Brenda. She’s ________________.",
                                    "option1"  "English",
                                    "option2"  "Taiwan",
                                    "option3"  "Russia",
                                    "option4"  "Germany",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       5,
                                    "question" "Where are your parents from? ________________ from Poland.",
                                    "option1"  "Their",
                                    "option2"  "They´re",
                                    "option3"  "Dare",
                                    "option4"  "There",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       6,
                                    "question" "How do you ________________ your surname? J-O-H-A-N-N-S-O-N. ",
                                    "option1"  "smell",
                                    "option2"  "spill",
                                    "option3"  "spell",
                                    "option4"  "swell",
                                    "answer"   3,
                                    "selected" 0

                                    }
                                   ]
                          },
                         {
                          "id"    2,
                          "title" "Stage 2",
                          "tasks" [
                                   {
                                    "id"       7,
                                    "question" "________________ in a bank? No, I work in a supermarket.",
                                    "option1"  "Work you",
                                    "option2"  "Works you",
                                    "option3"  "Do you work",
                                    "option4"  "Do works you",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       8,
                                    "question" "And here is your ________________.",
                                    "option1"  "offices",
                                    "option2"  "an office",
                                    "option3"  "a office",
                                    "option4"  "office",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       9,
                                    "question" "The new boss is not nice. I don’t like ________________.",
                                    "option1"  "her",
                                    "option2"  "hims",
                                    "option3"  "his",
                                    "option4"  "hers",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       10,
                                    "question" "Last year, I ________________ a car.",
                                    "option1"  "by",
                                    "option2"  "buy",
                                    "option3"  "buying",
                                    "option4"  "bought",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       11,
                                    "question" "If I see Jane, __________________ tell her.",
                                    "option1"  "I´ll",
                                    "option2"  "I´m",
                                    "option3"  "I am",
                                    "option4"  "I have",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       12,
                                    "question" "_________________ is this? It’s $32.",
                                    "option1"  "How cost",
                                    "option2"  "How many",
                                    "option3"  "How price",
                                    "option4"  "How much",
                                    "answer"   4,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    3,
                          "title" "Stage 3",
                          "tasks" [
                                   {
                                    "id"       13,
                                    "question" "This English test is ________________ the last one.",
                                    "option1"  "hardest",
                                    "option2"  "hardest than",
                                    "option3"  "hard than",
                                    "option4"  "harder than",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       14,
                                    "question" "So, Mr. Redwood, are you ________________?",
                                    "option1"  "interesting",
                                    "option2"  "interest",
                                    "option3"  "interestment",
                                    "option4"  "interested",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       15,
                                    "question" "There is a restaurant ________________ it is completely dark.",
                                    "option1"  "were",
                                    "option2"  "wear",
                                    "option3"  "we´re",
                                    "option4"  "where",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       16,
                                    "question" "I have been a teacher ______________ 5 years. ",
                                    "option1"  "since",
                                    "option2"  "for",
                                    "option3"  "ago",
                                    "option4"  "site",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       17,
                                    "question" "Would you like ________________ coffee?",
                                    "option1"  "some",
                                    "option2"  "those",
                                    "option3"  "many",
                                    "option4"  "lots",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       18,
                                    "question" "Could you ________________ where the conference room is?",
                                    "option1"  "explain me",
                                    "option2"  "tell me",
                                    "option3"  "me say",
                                    "option4"  "let me tell",
                                    "answer"   2,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    4,
                          "title" "Stage 4",
                          "tasks" [
                                   {
                                    "id"       19,
                                    "question" "How long _______________ a doctor?",
                                    "option1"  "was you",
                                    "option2"  "has you been",
                                    "option3"  "have you been",
                                    "option4"  "have you",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       20,
                                    "question" "I finished work early _____________I could see the ship exhibition.",
                                    "option1"  "in order to",
                                    "option2"  "so that",
                                    "option3"  "to",
                                    "option4"  "so as to",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       21,
                                    "question" "So far this week, we ________________ 5000 units.",
                                    "option1"  "have produced",
                                    "option2"  "producing",
                                    "option3"  "produce",
                                    "option4"  "have producing",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       22,
                                    "question" "_________________had an accident.",
                                    "option1"  "Terry is just",
                                    "option2"  "Terrys just",
                                    "option3"  "Terry´s just",
                                    "option4"  "Justs Terry",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       23,
                                    "question" "The new installation was installed ________________.",
                                    "option1"  "quickly",
                                    "option2"  "quick",
                                    "option3"  "quickie",
                                    "option4"  "more quick",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       24,
                                    "question" "Our costs were higher than ________________.",
                                    "option1"  "expect",
                                    "option2"  "expected",
                                    "option3"  "predict",
                                    "option4"  "imagine",
                                    "answer"   2,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    5,
                          "title" "Stage 5",
                          "tasks" [
                                   {
                                    "id"       25,
                                    "question" "This technology is _________________ on the market.",
                                    "option1"  "the most sophisticate",
                                    "option2"  "the most sophisticated",
                                    "option3"  "sophisticated the most",
                                    "option4"  "most sophisticate",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       26,
                                    "question" "I _______________ in the lobby, when I met an old friend.",
                                    "option1"  "have waited",
                                    "option2"  "am waiting",
                                    "option3"  "wait",
                                    "option4"  "was waiting",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       27,
                                    "question" "That song always ________________ me of my childhood.",
                                    "option1"  "remembers",
                                    "option2"  "remembered",
                                    "option3"  "remind",
                                    "option4"  "reminds",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       28,
                                    "question" "I was thinking to _______________, what would I do in this situation?",
                                    "option1"  "me",
                                    "option2"  "him",
                                    "option3"  "them",
                                    "option4"  "myself",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       29,
                                    "question" "How much funding will we get? Well, that ________________ a number of factors.",
                                    "option1"  "deepens on",
                                    "option2"  "depends of",
                                    "option3"  "depends on",
                                    "option4"  "deepens of",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       30,
                                    "question" "I would like to know _________________ or not you will be attending the meeting.",
                                    "option1"  "if",
                                    "option2"  "yes",
                                    "option3"  "when",
                                    "option4"  "whether",
                                    "answer"   4,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    6,
                          "title" "Stage 6",
                          "tasks" [
                                   {
                                    "id"       31,
                                    "question" "What’s up with Steven? He never _______________ be late.",
                                    "option1"  "turns up",
                                    "option2"  "used to",
                                    "option3"  "on time",
                                    "option4"  "used up",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       32,
                                    "question" "If I had more money, I ________________ buy a house.",
                                    "option1"  "will be able to",
                                    "option2"  "am able to",
                                    "option3"  "would be able to",
                                    "option4"  "had been able to",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       33,
                                    "question" "It’s not a problem. ________________ driving long distances.",
                                    "option1"  "I used to",
                                    "option2"  "I’m using",
                                    "option3"  "I’m used to",
                                    "option4"  "I used",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       34,
                                    "question" "I _______________ never met my dad. So, I was reluctant, at first, to pick up the phone.",
                                    "option1"  "was",
                                    "option2"  "did",
                                    "option3"  "have",
                                    "option4"  "had",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       35,
                                    "question" "It was _________________ a good time on holiday that we’re going back next year.",
                                    "option1"  "also",
                                    "option2"  "such",
                                    "option3"  "although",
                                    "option4"  "even",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       36,
                                    "question" "Terry ________________ his wife for 40 years before they got married.",
                                    "option1"  "known",
                                    "option2"  "have known",
                                    "option3"  "were known",
                                    "option4"  "had known",
                                    "answer"   4,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    7,
                          "title" "Stage 7",
                          "tasks" [
                                   {
                                    "id"       37,
                                    "question" "The venue for the Christmas party ________________ what budget we’re given.",
                                    "option1"  "depending",
                                    "option2"  "depends on",
                                    "option3"  "will depending",
                                    "option4"  "dependant",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       38,
                                    "question" "I lost my job. I’m not used ________________ so much free time.",
                                    "option1"  "to having",
                                    "option2"  "to have",
                                    "option3"  "of having",
                                    "option4"  "in have",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       39,
                                    "question" "Nothing could be done about the parking fine, ________________?",
                                    "option1"  "isn’t it",
                                    "option2"  "doesn’t it",
                                    "option3"  "could it",
                                    "option4"  "didn’t it",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       40,
                                    "question" "He _________________ a presentation before.",
                                    "option1"  "gived",
                                    "option2"  "has always give",
                                    "option3"  "has never given",
                                    "option4"  "gaved",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       41,
                                    "question" "Look at that sky. I think ________________ rain.",
                                    "option1"  "it’s going to",
                                    "option2"  "it has",
                                    "option3"  "it goes",
                                    "option4"  "will it",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       42,
                                    "question" "I haven’t ________________ sleep very well lately.",
                                    "option1"  "been able to",
                                    "option2"  "able to ",
                                    "option3"  "am able to",
                                    "option4"  "be able to",
                                    "answer"   1,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    8,
                          "title" "Stage 8",
                          "tasks" [
                                   {
                                    "id"       43,
                                    "question" "I don’t feel too good. I ________________ had that last whisky.",
                                    "option1"  "shouldn’t have",
                                    "option2"  "don’t",
                                    "option3"  "must",
                                    "option4"  "not should",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       44,
                                    "question" "There’s no need to prepare anything. The meeting ______________.",
                                    "option1"  "has been cancelled",
                                    "option2"  "was cancelling",
                                    "option3"  "has cancelled",
                                    "option4"  "were to cancel",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       45,
                                    "question" "We brainstormed a little and ________________ a few good ideas.",
                                    "option1"  "came up with",
                                    "option2"  "came down with",
                                    "option3"  "came across with",
                                    "option4"  "came forward with",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       46,
                                    "question" "Until we know more information, we’ll have to ________________ the new store.",
                                    "option1"  "postpone to open",
                                    "option2"  "postpone to opening",
                                    "option3"  "postpone opening",
                                    "option4"  "postpone open",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       47,
                                    "question" "I’m learning Japanese for _______________ with counterparts in Japan.",
                                    "option1"  "businessing",
                                    "option2"  "doing business",
                                    "option3"  "do business",
                                    "option4"  "to business",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       48,
                                    "question" "We should meet again. I’m very ______________more about your travels.",
                                    "option1"  "interested to hearing",
                                    "option2"  "interest for hear",
                                    "option3"  "interest of hear",
                                    "option4"  "interested in hearing",
                                    "answer"   4,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    9,
                          "title" "Stage 9",
                          "tasks" [
                                   {
                                    "id"       49,
                                    "question" "I’m very busy this week. I ________________ time to relax.",
                                    "option1"  "have little",
                                    "option2"  "have a few",
                                    "option3"  "not have",
                                    "option4"  "don’t a little",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       50,
                                    "question" "I know ________________ brother works in the financial department.",
                                    "option1"  "somebody whose",
                                    "option2"  "anybody who’s",
                                    "option3"  "anyone that",
                                    "option4"  "someone which is",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       51,
                                    "question" "Well, it’s late now. It looks ________________ John isn’t coming.",
                                    "option1"  "to be",
                                    "option2"  "that",
                                    "option3"  "as though",
                                    "option4"  "for that",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       52,
                                    "question" "I haven’t been able to drive since I __________________ my arm.",
                                    "option1"  "breaking",
                                    "option2"  "had broken",
                                    "option3"  "break",
                                    "option4"  "have broke",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       53,
                                    "question" "________________ if you would be able to contact the supplier again.",
                                    "option1"  "I think",
                                    "option2"  "I wonder",
                                    "option3"  "It seems",
                                    "option4"  "I want",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       54,
                                    "question" "Many people in the last decade _______________ stop smoking completely.",
                                    "option1"  "has decided to",
                                    "option2"  "have decided for",
                                    "option3"  "has decide on",
                                    "option4"  "have decided to",
                                    "answer"   4,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    10,
                          "title" "Stage 10",
                          "tasks" [
                                   {
                                    "id"       55,
                                    "question" "________________ my car, I realised I had forgotten my house keys.",
                                    "option1"  "Got into",
                                    "option2"  "Getting into",
                                    "option3"  "After get",
                                    "option4"  "Get in to",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       56,
                                    "question" "John had to ________________ the invitation because he was working late.",
                                    "option1"  "turn down",
                                    "option2"  "put down",
                                    "option3"  "run down",
                                    "option4"  "show down",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       57,
                                    "question" "On the one hand he’s a good worker, ________________, he’s rude.",
                                    "option1"  "othersides",
                                    "option2"  "an alternative",
                                    "option3"  "once again",
                                    "option4"  "on the other",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       58,
                                    "question" "In order to improve organization, we are ________________ a state-of-the-art internal communication system.",
                                    "option1"  "planning to install",
                                    "option2"  "planning installation",
                                    "option3"  "plan to install",
                                    "option4"  "plan installing",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       59,
                                    "question" "I trust you to take care of this. Just keep me ____________.",
                                    "option1"  "in the loop",
                                    "option2"  "on the circle",
                                    "option3"  "at the loop",
                                    "option4"  "under the ring",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       60,
                                    "question" "You have done a great job Frank. I ______________-judged you.",
                                    "option1"  "dis",
                                    "option2"  "un",
                                    "option3"  "mis",
                                    "option4"  "anti",
                                    "answer"   3,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    11,
                          "title" "Stage  11",
                          "tasks" [
                                   {
                                    "id"       61,
                                    "question" "Where’s my wallet? Oh no! I ______________it.",
                                    "option1"  "must have dropped",
                                    "option2"  "could have fallen",
                                    "option3"  "did lost",
                                    "option4"  "misplacing",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       62,
                                    "question" "If customers have to pay this price, they are going to feel _______________.",
                                    "option1"  "rip saw",
                                    "option2"  "ripped off",
                                    "option3"  "rip tide",
                                    "option4"  "rip stopped",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       63,
                                    "question" "Because of our meddling in the middle-east, our customers are ________________ to do repeated business with us.",
                                    "option1"  "disinterested",
                                    "option2"  "disfavoured",
                                    "option3"  "disinclined",
                                    "option4"  "discursive",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       64,
                                    "question" "I ______________for this moment all my life.",
                                    "option1"  "have wait",
                                    "option2"  "had waiting",
                                    "option3"  "have been wait",
                                    "option4"  "have been waiting",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       65,
                                    "question" "You _____________ better phone her up to check.",
                                    "option1"  "should",
                                    "option2"  "have",
                                    "option3"  "could",
                                    "option4"  "had",
                                    "answer"   4,
                                    "selected" 0
                                    },
                                   {
                                    "id"       66,
                                    "question" "You met her while working in Paris, _____________?",
                                    "option1"  "haven’t you",
                                    "option2"  "didn’t you",
                                    "option3"  "hadn’t you",
                                    "option4"  "don’t you",
                                    "answer"   2,
                                    "selected" 0
                                    }
                                   ]
                          },
                         {
                          "id"    12,
                          "title" "Stage  12",
                          "tasks" [
                                   {
                                    "id"       67,
                                    "question" "After the controversy, the president made a public ____________.",
                                    "option1"  "apologies",
                                    "option2"  "apologize",
                                    "option3"  "apology",
                                    "option4"  "apologetic",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       68,
                                    "question" "We can’t make a clear decision so should ___________ on the side of caution.",
                                    "option1"  "uhr",
                                    "option2"  "err",
                                    "option3"  "aargh",
                                    "option4"  "urll",
                                    "answer"   2,
                                    "selected" 0
                                    },
                                   {
                                    "id"       69,
                                    "question" "The chaos _____________ avoided if the shopping centre had opened the doors earlier.",
                                    "option1"  "could had been",
                                    "option2"  "can have been",
                                    "option3"  "could have been",
                                    "option4"  "can be",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       70,
                                    "question" "We have set up camp at one of the most _____________ parts of the island.",
                                    "option1"  "distance",
                                    "option2"  "farther",
                                    "option3"  "secluded",
                                    "option4"  "remotely",
                                    "answer"   3,
                                    "selected" 0
                                    },
                                   {
                                    "id"       71,
                                    "question" "You’re fired! Now get ______________ my sight.",
                                    "option1"  "out of",
                                    "option2"  "into",
                                    "option3"  "away from",
                                    "option4"  "rid of",
                                    "answer"   1,
                                    "selected" 0
                                    },
                                   {
                                    "id"       72,
                                    "question" "Anger and lack of trust are the ______________ of a relationship.",
                                    "option1"  "vein",
                                    "option2"  "ban",
                                    "option3"  "bane",
                                    "option4"  "van",
                                    "answer"   3,
                                    "selected" 0
                                    }
                                   ]
                          }
                         ]
             }

            ]
   }

  )