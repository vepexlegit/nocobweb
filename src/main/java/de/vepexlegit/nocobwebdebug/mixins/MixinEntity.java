package de.vepexlegit.nocobwebdebug.mixins;

import de.vepexlegit.nocobwebdebug.NoCobweb;
import de.vepexlegit.nocobwebdebug.commands.NoCobwebCommand;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.ClientCommandHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public class MixinEntity {

    @Inject(method = "onUpdate", at = @At("RETURN"))
    private void startGame(final CallbackInfo ci) {
        ClientCommandHandler.instance.registerCommand(new NoCobwebCommand());
    }

    @Shadow private boolean isInWeb;

    @Inject(method = "setInWeb", at = @At("RETURN"))
    private void setInWeb(final CallbackInfo ci) {
        if (NoCobweb.INSTANCE.isEnabled()) {
            this.isInWeb = false;
        }
    }
}
