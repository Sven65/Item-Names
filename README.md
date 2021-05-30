# Item-Names
Small library for Spigot to get NMS names from ItemStacks 

This was made as a learning experience for me on how to create and use external libraries,
and as a central dependency for these functions, so I don't have to write the code 40 times over.

It's currently used in [[ChatItems]](https://github.com/Sven65/ChatItem)

JavaDocs can be found [here](https://mackan.xyz/Item-Names/).

# Requirements

Java 8 and Bukkit / Spigot.

Supports versions after 1.8. (Read FAQ if your version isn't supported)

# Usage

ItemNames requires Maven or a Maven compatible build System and is available on [JitPack.io](https://jitpack.io/#Sven65/Item-Names)

### pom.xml

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

```xml
<dependency>
    <groupId>com.github.Sven65.Item-Names</groupId>
    <artifactId>ItemNames</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

# Code Examples

To get the name of an ItemStack, simply call `ItemNames.getItemName(ItemStack);`

# FAQ

### My version isn't supported. What should I do?
- If you're a dev, submit a pull request with an implementation for your version, otherwise create an issue on their tab.
