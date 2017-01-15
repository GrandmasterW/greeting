# greeting
A simple example using ClojureScript with React and Reagent

This simple demo shows two ways of setting an atom. The atom is used as the user's name to generate a greeting line. We provide to text input fields: 

1. Traditional input field with OK button - name is changed on click
2. Live input field which updates the name on every key stroke

It uses reagent-frontend setting together with the figwheel environment. 

If you want to try yourself, do the following steps (on Mac OS X, Java installed)

1. Create the project with leiningen: lein new reagent-frontend greeting
2. Start figwheel for REPL and autobuild: lein figwheel 
3. Open a browser window and load the start page file: public/index.html
4. Wait for figwheel to connect the REPL to the browser, until you see the REPL command line

