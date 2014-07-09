# omdev

An Om component that enlive your existing component adding extra features for developement.
[http://jvuillermet.svbtle.com/om-dev-component](http://jvuillermet.svbtle.com/om-dev-component)

- State navigation (undo/redo)
- State snapshot
- Go to State input
- Pretty print (js object & edn) in console
- Print State history on javascript error
- hopefully more to come ...

![](http://i60.tinypic.com/14mgu3p.png)

## Usage

[![Clojars Project](http://clojars.org/omdev/latest-version.svg)](http://clojars.org/omdev)

Just replace om/root with omdev/dev-component

```clojure
(ns goss.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [cljs.reader :as reader]
            [omdev.core :as omdev]))

(omdev/dev-component my-component
    (atom {:text "Instrument!"
           :list [{:text "Milk"} {:text "Cookies"} {:text "Applesss"}]})
    {:target (.getElementById js/document "app")
     :tx-listen (fn [tx-data root-cursor]
                  (println "listener 1: " tx-data))})
``` 

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
