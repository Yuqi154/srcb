package net.heipiao.mixin;

import net.minecraft.entity.vehicle.CommandBlockMinecartEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CommandBlockMinecartEntity.class)
public abstract class CommandBlockMinecartEntityMixin {
	@Inject(at = @At("HEAD"), method = "onActivatorRail", cancellable = true)
	private void init(int x, int y, int z, boolean powered, CallbackInfo ci) {
		ci.cancel();
	}
}