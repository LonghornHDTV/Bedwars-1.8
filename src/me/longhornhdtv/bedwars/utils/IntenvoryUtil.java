package me.longhornhdtv.bedwars.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class IntenvoryUtil implements Listener{

	public static HashMap<Integer, Material> bloecke_mat = new HashMap<>();
	public static HashMap<Integer, Integer> bloecke_price = new HashMap<>();
	public static HashMap<Integer, Material> ruestung_mat = new HashMap<>();
	public static HashMap<Integer, Integer> ruestung_price = new HashMap<>();
	
	
	//Inventories
	public void openBloeckeInv(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9*2, "§8➤ §c§lShop §8- §c§lBlöcke");
		HashMap<Enchantment, Integer> list = new HashMap<>();
		list.put(Enchantment.SILK_TOUCH, 1);
		inv.setItem(0, createItemenchant(Material.SANDSTONE, "§8➤ §7Blöcke", "", list));
		inv.setItem(1, createItem(Material.CHAINMAIL_CHESTPLATE, "§8➤ §7Rüstung"));
		inv.setItem(2, createItem(Material.IRON_PICKAXE, "§8➤ §7Spitzhacken"));
		inv.setItem(3, createItem(Material.WOOD_SWORD, "§8➤ §7Schwerter"));
		inv.setItem(4, createItem(Material.BOW, "§8➤ §7Bögen"));
		inv.setItem(5, createItem(Material.CAKE, "§8➤ §7Essen"));
		inv.setItem(6, createItem(Material.ENDER_CHEST, "§8➤ §7Kisten"));
		inv.setItem(7, createItem(Material.GLASS_BOTTLE, "§8➤ §7Tränke"));
		inv.setItem(8, createItem(Material.EMERALD, "§8➤ §7Spezial"));
		inv.setItem(11, createItemal(Material.SANDSTONE, "§cSandstein", 2, Arrays.asList("§7§l1 Bronze")));
		inv.setItem(12, createItemal(Material.ENDER_STONE, "§cEndstein", 1, Arrays.asList("§7§l7 Bronze")));
		inv.setItem(13, createItemal(Material.IRON_BLOCK, "§cEisenblock", 1, Arrays.asList("§7§l3 Eisen")));
		inv.setItem(14, createItem(Material.BARRIER, "§8§lNicht Verfügbar"));
		inv.setItem(15, createItemal(Material.GLOWSTONE, "§cGlowstone", 1, Arrays.asList("§7§l4 Bronze")));
	
		p.openInventory(inv);
	}
	
	public void openRuestungInv(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9*2, "§8➤ §c§lShop §8- §c§lRüstung");
		HashMap<Enchantment, Integer> list = new HashMap<>();
		list.put(Enchantment.SILK_TOUCH, 1);
		inv.setItem(0, createItem(Material.SANDSTONE, "§8➤ §7Blöcke"));
		inv.setItem(1, createItemenchant(Material.CHAINMAIL_CHESTPLATE, "§8➤ §7Rüstung", "", list));
		inv.setItem(2, createItem(Material.IRON_PICKAXE, "§8➤ §7Spitzhacken"));
		inv.setItem(3, createItem(Material.WOOD_SWORD, "§8➤ §7Schwerter"));
		inv.setItem(4, createItem(Material.BOW, "§8➤ §7Bögen"));
		inv.setItem(5, createItem(Material.CAKE, "§8➤ §7Essen"));
		inv.setItem(6, createItem(Material.ENDER_CHEST, "§8➤ §7Kisten"));
		inv.setItem(7, createItem(Material.GLASS_BOTTLE, "§8➤ §7Tränke"));
		inv.setItem(8, createItem(Material.EMERALD, "§8➤ §7Spezial"));
		inv.setItem(9, createItemarmor("§cLederhelm", "§7§l1 Bronze", Material.LEATHER_HELMET, p));
		inv.setItem(10, createItemarmor("§cLederhose", "§7§l1 Bronze", Material.LEATHER_LEGGINGS, p));
		inv.setItem(11, createItemarmor("§cLederschuhe", "§7§l1 Bronze", Material.LEATHER_BOOTS, p));
		inv.setItem(14, createItemal(Material.CHAINMAIL_CHESTPLATE, "§cBrustplatte Level 1", 1, Arrays.asList("§7§l1 Eisen")));
		list.put(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		inv.setItem(15, createItemenchant(Material.CHAINMAIL_CHESTPLATE, "§cBrustplatte Level 2", "§7§l3 Eisen", list));
		list.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		inv.setItem(16, createItemenchant(Material.CHAINMAIL_CHESTPLATE, "§cBrustplatte Level 3", "§7§l5 Eisen", list));
		list.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		list.put(Enchantment.THORNS, 1);
		inv.setItem(17, createItemenchant(Material.CHAINMAIL_CHESTPLATE, "§cBrustplatte Level 4", "§7§l7 Eisen", list));
	
		p.openInventory(inv);
	}
	
	
	public static void openMainInv(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9*1, "§8➤ §c§lShop");
		inv.addItem(createItem(Material.SANDSTONE, "§8➤ §7Blöcke"));
        inv.addItem(createItem(Material.CHAINMAIL_CHESTPLATE, "§8➤ §7Rüstung"));
        inv.addItem(createItem(Material.IRON_PICKAXE, "§8➤ §7Spitzhacken"));
        inv.addItem(createItem(Material.WOOD_SWORD, "§8➤ §7Schwerter"));
        inv.addItem(createItem(Material.BOW, "§8➤ §7Bögen"));
        inv.addItem(createItem(Material.CAKE, "§8➤ §7Essen"));
        inv.addItem(createItem(Material.ENDER_CHEST, "§8➤ §7Kisten"));
        inv.addItem(createItem(Material.GLASS_BOTTLE, "§8➤ §7Tränke"));
        inv.addItem(createItem(Material.EMERALD, "§8➤ §7Spezial"));
        
        p.openInventory(inv);
	}
	
	//UTIS
	public static ItemStack createItem(Material mat, String name) {
		ItemStack item = new ItemStack(mat);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(name);;
		item.setItemMeta(itemmeta);
		return item;
	}
	
	public static ItemStack createItemal(Material mat, String name, Integer amount, List<String> lore) {
		ItemStack item = new ItemStack(mat, amount);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(name);
		itemmeta.setLore(lore);
		item.setItemMeta(itemmeta);
		return item;
	}
	
	public static ItemStack createItemenchant(Material m, String name, String lore, HashMap<Enchantment, Integer> list){
        ItemStack item = new ItemStack(m);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.setLore(Arrays.asList(lore));
        for(Enchantment e : list.keySet()){
            itemm.addEnchant(e, list.get(e), true);
        }
        item.setItemMeta(itemm);
        return item;
    }
	
	public static ItemStack createItemarmor(String name, String lore, Material m, Player p) {
		ItemStack item = new ItemStack(m);
		LeatherArmorMeta itemmeta = (LeatherArmorMeta) item.getItemMeta();
		itemmeta.setDisplayName(name);
		itemmeta.setLore(Arrays.asList(lore));
		itemmeta.setColor(Color.PURPLE);
		item.setItemMeta(itemmeta);
		return item;
	}
	
	
	public static boolean removeInventoryItemsStack(PlayerInventory inv, Material type, int amount, ItemStack add) {
        int maxamount = 0;
        ItemStack[] arritemStack = inv.getContents();
        int n = arritemStack.length;
        int n2 = 0;
        while (n2 < n) {
            ItemStack is = arritemStack[n2];
            if (is != null && is.getType() == type) {
                maxamount += is.getAmount();
            }
            ++n2;
        }
        if(maxamount < amount) {
        	return false;
        }
        int amountofitems = maxamount / amount;
        if (add.getAmount() == 2) {
            if (amountofitems >= 33) {
                amountofitems = 32;
            }
        } else if (amountofitems >= 65) {
            amountofitems = 64;
        }
        int remove = amountofitems * amount;
        removeInventoryItems(inv, type, remove);
        int i = 0;
        while (i < amountofitems) {
            inv.addItem(new ItemStack[]{add});
            ++i;
        }
        return true;
    }
    public static boolean removeInventoryItems(PlayerInventory inv, Material type, int amount) {
        boolean b = false;
        ItemStack[] arritemStack = inv.getContents();
        int n = arritemStack.length;
        int n2 = 0;
        while (n2 < n) {
            ItemStack is = arritemStack[n2];
            if (is != null && is.getType() == type) {
                b = true;
                int newamount = is.getAmount() - amount;
                if (newamount > 0) {
                    is.setAmount(newamount);
                    break;
                }
                inv.remove(is);
                amount = - newamount;
                if (amount == 0) break;
            }
            ++n2;
        }
        if(amount != 0) {
        	b = false;
        }
        return b;
    }
	
	//Listeners
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().contains("§8➤ §c§lShop")) {
			if(e.getClickedInventory() != p.getInventory()) {
				e.setCancelled(true);
				if(e.getCurrentItem() == null) {
					return;
				}
				if(e.getCurrentItem().getType() != Material.AIR) {
					String s = "";
					if(e.getCurrentItem().hasItemMeta()) {
						s = e.getCurrentItem().getItemMeta().getDisplayName();
					}else{
						return;
					}
					if(s.equalsIgnoreCase("§8➤ §7Blöcke")) {
						openBloeckeInv(p);
						p.updateInventory();
					}else
					if(s.equalsIgnoreCase("§8➤ §7Rüstung")) {
						openRuestungInv(p);
						p.updateInventory();
					}
				}
			}
			
			if(e.getInventory().getName().contains("§8➤ §c§lShop §8-")) {
				if(e.getClickedInventory() != p.getInventory()) {
					e.setCancelled(true);
					
					String s = "";
					if(e.getCurrentItem().hasItemMeta()) {
						s = e.getCurrentItem().getItemMeta().getDisplayName();
					}else{
						return;
					}
					
					HashMap<Integer, Material> list1 = new HashMap<>();
					HashMap<Integer, Integer> list2 = new HashMap<>();
					
					if(e.getInventory().getName().contains("Blöcke")) {
						list1 = bloecke_mat;
						list2 = bloecke_price;
					}
					if(e.getInventory().getName().contains("Rüstung")) {
						list1 = ruestung_mat;
						list2 = ruestung_price;
					}
					
					if(list1 != null && list2 != null && s.contains("§c")) {
						if(e.getAction() == InventoryAction.MOVE_TO_OTHER_INVENTORY) {
							int price = 0;
							Material waehrung = null;
							
							if(list2.containsKey(e.getSlot())) {
								price = list2.get(e.getSlot());
							}else{
								p.sendMessage("§cEs ist ein Fehler aufgetreten!");
                                e.getView().close();
                                return;
							}
							
							if(list1.containsKey(e.getSlot())) {
								waehrung = list1.get(e.getSlot());
							}else{
								p.sendMessage("§cEs ist ein Fehler aufgetreten!");
                                e.getView().close();
                                return;
							}
							
							int amount = e.getCurrentItem().getAmount();
							Material m = e.getCurrentItem().getType();
							short nebenID = e.getCurrentItem().getData().getData();
							
							
							ItemStack add = new ItemStack(m, amount, nebenID);
							if(e.getCurrentItem().getType() == Material.LEATHER_HELMET || e.getCurrentItem().getType() == Material.LEATHER_CHESTPLATE
                                    || e.getCurrentItem().getType() == Material.LEATHER_LEGGINGS || e.getCurrentItem().getType() == Material.LEATHER_BOOTS) {
								LeatherArmorMeta itemmeta = (LeatherArmorMeta) add.getItemMeta();
								LeatherArmorMeta im2 = (LeatherArmorMeta) e.getCurrentItem().getItemMeta();
								
								itemmeta.setColor(im2.getColor());
								
								Map<Enchantment, Integer> enchanments = e.getCurrentItem().getItemMeta().getEnchants();
								
								for(Enchantment ench : enchanments.keySet()) {
									itemmeta.addEnchant(ench, enchanments.get(ench), true);
								}
								add.setItemMeta(itemmeta);
								
								if(removeInventoryItemsStack(p.getInventory(), waehrung, price, add)) {
									p.playSound(p.getLocation(), Sound.ITEM_PICKUP, 1, 1);
								}else{
									p.sendMessage("§cDu hast zu wenig Ressourcen!");
//									openMainInv(p);
								}
							}else{
								ItemMeta itemmeta = add.getItemMeta();
								Map<Enchantment, Integer> enchanments = e.getCurrentItem().getItemMeta().getEnchants();
								
								for(Enchantment ench : enchanments.keySet()) {
									itemmeta.addEnchant(ench, enchanments.get(ench), true);
								}
								add.setItemMeta(itemmeta);
								
								if(removeInventoryItemsStack(p.getInventory(), waehrung, price, add)) {
									p.playSound(p.getLocation(), Sound.ITEM_PICKUP, 1, 1);
								}else{
									p.sendMessage("§cDu hast zu wenig Ressourcen!");
//	                            	openMainInv(p);
								}
							}
						}else{
							int price = 0;
                            Material waehrung = null;

                            if(list2.containsKey(e.getSlot())){
                                price = list2.get(e.getSlot());
                            }else{
                                p.sendMessage("§cEs ist ein Fehler aufgetreten!");
                                e.getView().close();
                                return;
                            }

                            if(list1.containsKey(e.getSlot())){
                                waehrung = list1.get(e.getSlot());
                            }else{
                                p.sendMessage("§cEs ist ein Fehler aufgetreten!");
                                e.getView().close();
                                return;
                            }
                            
                            int amount = e.getCurrentItem().getAmount();
                            Material m = e.getCurrentItem().getType();
                            short nebenID = e.getCurrentItem().getData().getData();
                            
                            if(p.getInventory().contains(waehrung, price)) {
                            	p.playSound(p.getLocation(), Sound.ITEM_PICKUP, 1, 1);
                            	
                            	removeInventoryItems(p.getInventory(), waehrung, price);
                            	
                            	if(e.getCurrentItem().getType() == Material.LEATHER_HELMET || e.getCurrentItem().getType() == Material.LEATHER_CHESTPLATE
                                        || e.getCurrentItem().getType() == Material.LEATHER_LEGGINGS || e.getCurrentItem().getType() == Material.LEATHER_BOOTS){
                            		ItemStack item = new ItemStack(m,amount,nebenID);
                                    LeatherArmorMeta itemm = (LeatherArmorMeta) item.getItemMeta();

                                    LeatherArmorMeta im2 = (LeatherArmorMeta)e.getCurrentItem().getItemMeta();

                                    itemm.setColor(im2.getColor());

                                    Map<Enchantment, Integer> enchanments = e.getCurrentItem().getItemMeta().getEnchants();

                                    for(Enchantment ench : enchanments.keySet()){
                                        itemm.addEnchant(ench, enchanments.get(ench), true);
                                    }
                                    item.setItemMeta(itemm);
                                    p.getInventory().addItem(item);
                            	}else{
	                            	ItemStack item = new ItemStack(m, amount, nebenID);
	                            	ItemMeta itemmeta = item.getItemMeta();
	                            	
	                            	Map<Enchantment, Integer> enchanments = e.getCurrentItem().getItemMeta().getEnchants();
	                            	
	                            	for(Enchantment ench : enchanments.keySet()) {
	                            		itemmeta.addEnchant(ench, enchanments.get(ench), true);
	                            	}
	                            	item.setItemMeta(itemmeta);
	                            	p.getInventory().addItem(item);
                            	}
                            }else{
                            	p.sendMessage("§cDu hast zu wenig Ressourcen!");
//                            	openMainInv(p);
                            }
						}
					}else
					if(s.contains("§8§lNicht Verfügbar")) {
						p.sendMessage("§8§lNicht Verfügbar");
						return;
					}else{
						return;
					}
				}
			}
		}
	}
}
