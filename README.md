# greeting
A simple example using ClojureScript with React and Reagent (frontend only). 

This simple demo shows two ways of setting an atom. The atom "atomname" is used as the user's name to generate a greeting line. We provide to text input fields: 

1. Traditional input field with OK button - name is changed on click
2. Live input field which updates the name on every key stroke

It uses reagent-frontend setting together with the figwheel environment. 

If you want to try yourself, do the following steps (on Mac OS X, Java installed)

1. Create the project with leiningen: lein new reagent-frontend greeting
2. Start figwheel for REPL and autobuild: lein figwheel 
3. Open a browser window and load the start page file: public/index.html, you may want to reload after a few seconds, if it shows an error message
4. Wait for figwheel to connect the REPL to the browser, until you see the REPL command line

Disclaimer: I'm not really a good programmer, my coding experience is some 10 years or more away. Anyway in this demo I've used reagent / react though you could reasonably do without, in JavaScript or in ClojureScript. However, I was looking into reagent and had to try it :-) 


Credits

I've learned a lot from https://reagent-project.github.io/
