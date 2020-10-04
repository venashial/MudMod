package net.mcreator.mudmod.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.mudmod.item.MudBallItem;
import net.mcreator.mudmod.MudModModElements;

import java.util.Map;

@MudModModElements.ModElement.Tag
public class MudBallRangedItemUsedProcedure extends MudModModElements.ModElement {
	public MudBallRangedItemUsedProcedure(MudModModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure MudBallRangedItemUsed!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((new ItemStack(MudBallItem.block, (int) (1)).getItem() == (itemstack).getItem())) {
			((itemstack)).shrink((int) 1);
		}
	}
}
