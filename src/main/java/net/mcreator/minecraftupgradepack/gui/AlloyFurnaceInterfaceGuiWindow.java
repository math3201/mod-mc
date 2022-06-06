
package net.mcreator.minecraftupgradepack.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.minecraftupgradepack.procedures.Progress9Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress8Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress7Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress6Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress5Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress4Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress3Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress2Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress1Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress14Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress13Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress12Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress11Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress10Procedure;
import net.mcreator.minecraftupgradepack.procedures.Progress0Procedure;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AlloyFurnaceInterfaceGuiWindow extends ContainerScreen<AlloyFurnaceInterfaceGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = AlloyFurnaceInterfaceGui.guistate;

	public AlloyFurnaceInterfaceGuiWindow(AlloyFurnaceInterfaceGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("minecraft_upgrade_pack:textures/alloy_furnace_interface.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		if (Progress0Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/0.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress1Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/1.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress2Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/2.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress3Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/3.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress4Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/4.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress5Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/5.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress6Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/6.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress7Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/7.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress8Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/8.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress9Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/9.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress10Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/10.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress11Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/11.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress12Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/12.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress13Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/13.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		if (Progress14Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("minecraft_upgrade_pack:textures/14.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 52, 0, 0, 16, 5, 16, 5);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Alloy Furnace", 6, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
	}
}
