fun doSomethingWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection.groupBy { it.length }

    val maximumSizeOfGroup = groupsByLength.values.maxOfOrNull { it.size }

    return groupsByLength.values.firstOrNull { group -> maximumSizeOfGroup == group.size }
}
