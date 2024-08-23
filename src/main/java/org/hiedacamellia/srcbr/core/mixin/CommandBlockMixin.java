package org.hiedacamellia.srcbr.core.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BaseCommandBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CommandBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CommandBlock.class)
public abstract class CommandBlockMixin {

	@Inject(at = @At(value = "HEAD"), method = "execute", cancellable = true)
	private void init(BlockState state, Level level, BlockPos pos, BaseCommandBlock logic, boolean canTrigger, CallbackInfo ci) {
		ci.cancel();
	}
}