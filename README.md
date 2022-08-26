## PlayerAnimator Forge examplemod

This is a slightly modified Forge MDK, to demonstrate some usages of [PlayerAnimator](https://github.com/KosmX/minecraftPlayerAnimator) library on Forge.  

ExampleMod.java is unchanged.

This demo does **not** use mixins.  
In this example, I avoid lambda functions for better readability.

### PlayerAnimatorExample  
It is a demo class, how should you load playerAnimator resources from minecraft resourcePacks (including the modPack) and map the players.  

```java
//Use this to get the animation container for the current player
PlayerAnimatorExample.animationData.get(clientPlayer) 
```
```java
//Use this to get a loaded KeyframeAnimation
PlayerAnimatorExample.animations.get(animationID)
```

### PlayerAnimationTrigger
is an example, how to trigger actual animation on a specific player.  
Of course, the event, you'll use will be different.  
