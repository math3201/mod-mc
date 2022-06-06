
package net.mcreator.minecraftupgradepack.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.minecraftupgradepack.MinecraftUpgradePackModElements;

@MinecraftUpgradePackModElements.ModElement.Tag
public class AluminiumShovelItem extends MinecraftUpgradePackModElements.ModElement {
	@ObjectHolder("minecraft_upgrade_pack:aluminium_shovel")
	public static final Item block = null;

	public AluminiumShovelItem(MinecraftUpgradePackModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 230;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0.1999999999999997f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AluminiumIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("aluminium_shovel"));
	}
}
