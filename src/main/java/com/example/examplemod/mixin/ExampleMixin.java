package com.example.examplemod.mixin;

import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraftforge.internal.BrandingControl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.function.BiConsumer;


@Mixin(TitleScreen.class)
public class ExampleMixin {

    @Redirect(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/internal/BrandingControl;forEachLine(ZZLjava/util/function/BiConsumer;)V"))
    private void rebrandForge(boolean includeMC, boolean reverse, BiConsumer<Integer, String> originalLineConsumer) {
        BrandingControl.forEachLine(includeMC, reverse, (brdline, brd) -> {
            // sorry
            originalLineConsumer.accept(brdline, brd.replace("Forge", "Froge"));
        });
    }
}