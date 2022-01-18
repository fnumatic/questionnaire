(ns cljs-reframe-template.demoquiz)

(def data
  {
	"meta" : {
        "title" : "<the title of the quiz, shown at the start of the quiz>",
		"author" : "<your name>; <your@email.address>",
		"licence" : "<copyright or e.g. GNU public licence string>",
		"homepage" : "<https://your.url.com>",
		"contributors" : [
            "<Jim>; <jim@jim.com>",
            "<Bob>",
            "<Alice>"
        ]
	},
	"quiz" : {
		"<enter chapter name>" : {
			"<enter question id>" : {
			"question" : "<question itself here>?",
			"answers" : { 
					"A" : "<not>",
					"B" : "<always>",
					"C" : "<four>",
					"D" : "<alternatives>" 
				},
			"right" : ["B","D"]
            }
        }
    }
})