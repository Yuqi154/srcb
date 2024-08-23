package org.hiedacamellia.srcbr.core.mixin;

import net.minecraft.world.level.block.entity.CommandBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CommandBlockEntity.class)
public abstract class CommandBlockMinecartEntityMixin {
	@Inject(at = @At("HEAD"), method = "scheduleTick", cancellable = true)
	private void init(CallbackInfo ci) {
		ci.cancel();
	}
}