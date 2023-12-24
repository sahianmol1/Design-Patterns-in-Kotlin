### Factory Method

A Factory method handles object creation and encapsulates it in a subclass. This decouples the client code in the superclass from the object creation code in a subclass.

```
abstract fun factoryMethod(type: ProductType): Product
```

