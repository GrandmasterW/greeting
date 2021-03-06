# greeting
A simple example using ClojureScript with React and Reagent (frontend only). 

This simple demo shows two ways of setting an atom. The atom "atomname" is used as the user's name to generate a greeting line. We provide to text input fields: 

1. Traditional input field with OK button - name is changed on click
2. Live input field which updates the name on every key stroke

It uses reagent-frontend setting together with the figwheel environment. 

If you want to try the example source, do the following steps (on Mac OS X, Java installed, Leiningen 2.7.1 on Java 1.8.0_77)

1. Create the project with leiningen: lein new reagent-frontend greeting
2. Download the source file core.cljs into src/greeting
3. Start figwheel for REPL and autobuild: lein figwheel
4. Wait for figwheel message: "Prompt will show when Figwheel connects to your application"
5. Wait for the browser to open and show the page, otherwise load it manually: http://localhost:3449/index.html
6. Wait for figwheel to connect the REPL to the browser, until you see the REPL command line

Disclaimer: I'm not really a good programmer, my coding experience is some 10 years or more away. In this demo I've used reagent / react though you could reasonably do without, in JavaScript or in ClojureScript. However, I was looking into reagent and found it so awesome that I had to try it :-) 


Credits

I've learned a lot from https://reagent-project.github.io/
