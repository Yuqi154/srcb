package net.heipiao.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.CommandBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CommandBlock.class)
public abstract class CommandBlockMixin {

	@Inject(at = @At(value = "INVOKE", target = "Lnet/minecraft/block/entity/CommandBlockBlockEntity;updateConditionMet()Z"), method = "scheduledTick", cancellable = true)
	private void init(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci) {
		ci.cancel();
	}
}