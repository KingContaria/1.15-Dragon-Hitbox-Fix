package com.kingcontaria.dragonhitboxfix;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EntityRenderDispatcher.class)
public class EntityRenderDispatcherMixin {

    @Redirect(method = "renderHitbox", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;getX()D", ordinal = 0))
    private double fixX(Entity dragon) {
        return 0;
    }

    @Redirect(method = "renderHitbox", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;getY()D", ordinal = 0))
    private double fixY(Entity dragon) {
        return 0;
    }

    @Redirect(method = "renderHitbox", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;getZ()D", ordinal = 0))
    private double fixZ(Entity dragon) {
        return 0;
    }


}
