# Groovy's `each` Method Gotcha

This repository demonstrates a common pitfall when using the `each` method in Groovy. The `each` method iterates over a collection and applies a closure to each element, but it doesn't return a transformed collection.  This behavior differs from methods like `collect` or `map` in other languages.

## The Problem

The `each` method in Groovy is often used for side effects, such as printing elements or modifying external state.  However, if you expect it to return a new list containing the transformed elements, you'll encounter unexpected `null` values.

## The Solution

To achieve the desired transformation, use the `collect` or `map` methods, which explicitly return a new list with the results of the closure applied to each element.

## How to Reproduce

1. Clone this repository.
2. Run the `bug.groovy` script.  Observe that it prints `null`.
3. Run the `bugSolution.groovy` script. Observe that it prints the expected transformed list.