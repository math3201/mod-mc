
package net.mcreator.minecraftupgradepack.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.minecraftupgradepack.MinecraftUpgradePackModElements;

@MinecraftUpgradePackModElements.ModElement.Tag
public class AluminiumHoeItem extends MinecraftUpgradePackModElements.ModElement {
	@ObjectHolder("minecraft_upgrade_pack:aluminium_hoe")
	public static final Item block = null;

	public AluminiumHoeItem(MinecraftUpgradePackModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 230;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 1f;
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
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("aluminium_hoe"));
	}
}
