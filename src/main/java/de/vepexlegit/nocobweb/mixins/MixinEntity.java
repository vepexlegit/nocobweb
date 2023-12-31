package de.vepexlegit.nocobweb.mixins;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public class MixinEntity {

    @Shadow private boolean isInWeb;

    @Inject(method = "setInWeb", at = @At("RETURN"))
    private void setInWeb(final CallbackInfo ci) {
        this.isInWeb = false;
    }
}
