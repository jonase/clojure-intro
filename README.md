# clojure-intro

1. Make sure you have Java (1.6 or newer) and [Leiningen](http://leiningen.org/) installed:

```
$ lein version
Leiningen 2.5.1 on Java 1.7.0_75 Java HotSpot(TM) 64-Bit Server VM
```

2. Clone the repo

```
$ git clone https://github.com/jonase/clojure-intro.git
$ cd clojure-intro
```

3. Start the read-eval-print-loop (REPL) server. If this is the first time you run leiningen it will take a while to download all dependencies.

```
$ lein gorilla
Gorilla-REPL: 0.3.4
Started nREPL server on port 64903
Running at http://127.0.0.1:64905/worksheet.html .
Ctrl+C to exit.
```

4. Copy the URL (http://127.0.0.1:64905/worksheet.html) and paste it into your browser. Note that the port will differ.

5. Open the `worksheet.clj` by hitting `ctrl+g, ctrl+l`.

## License

Copyright © 2015 Jonas Enlund

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
