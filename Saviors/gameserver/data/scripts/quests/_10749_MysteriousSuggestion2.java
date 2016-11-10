/*package quests;

import l2s.gameserver.model.Player;
import l2s.gameserver.model.instances.NpcInstance;
import l2s.gameserver.model.quest.Quest;
import l2s.gameserver.model.quest.QuestState;

*//**
	* @author GodWorld & l2s-DEV
	**//*
			public class _10749_MysteriousSuggestion2 extends Quest
			{
			// NPC'S
			private static final int MUSTERIOUS_BUTLER = 33685;
			
			// Item's
			private static final int TOURNAMENT_REMNANTS_II = 35551;
			private static final int MYSTERIOUS_MARK = 34903;
			private static final int MYSTERIOUS_MARK2 = 34904;
			
			public _10749_MysteriousSuggestion2()
			{
			super(PARTY_NONE,REPEATABLE);
			addStartNpc(MUSTERIOUS_BUTLER);
			addTalkId(MUSTERIOUS_BUTLER);
			addQuestItem(TOURNAMENT_REMNANTS_II);
			addLevelCheck(1);
			}
			
			@Override
			public String onEvent(String event, QuestState st, NpcInstance npc) 
			{
			String htmltext = event;
			if(event.equalsIgnoreCase("grankain_lumiere_q10749_03.htm"))
			{
				st.setCond(1);
				st.playSound(SOUND_ACCEPT);
			}
			return htmltext;
			}
			
			@Override
			public String onTalk(NpcInstance npc, QuestState st) 
			{
			int npcId = npc.getNpcId();
			int cond = st.getCond();
			String htmltext = "noquest";
			if(npcId == MUSTERIOUS_BUTLER)
			{
				if(st.isStarted())
				{
					if(cond == 1)
						htmltext = "grankain_lumiere_q10749_06.htm";
					else if(cond == 2)
					{
						st.takeItems(TOURNAMENT_REMNANTS_II, 5);
						st.giveItems(MYSTERIOUS_MARK, 1);
						st.giveItems(MYSTERIOUS_MARK2, 1);
						st.getPlayer().setFame(st.getPlayer().getFame() + 3000, "10748", false);
						st.playSound(SOUND_FINISH);
						st.exitCurrentQuest(REPEATABLE);
						htmltext = "grankain_lumiere_q10749_07.htm";
					}
				}
				else
				{
					if(checkStartCondition(st.getPlayer()) && st.getPlayer().getLevel() >= 1)
					{
						if(st.isNowAvailable())
							htmltext = "grankain_lumiere_q10749_01.htm";
						else
							htmltext = "grankain_lumiere_q10749_05.htm";
					}
					else
						htmltext = "grankain_lumiere_q10749_04.htm";
				}
			}
			
			return htmltext;
			}
			
			@Override
			public void onHaosBattleEnd(Player player, boolean isWinner)
			{
			if(player != null)
			{
				QuestState st = player.getQuestState(_10749_MysteriousSuggestion2.this);
				if((st != null) && (st.isStarted()))
				{
					if(st.getQuestItemsCount(TOURNAMENT_REMNANTS_II) < 5L)
					{
						st.giveItems(TOURNAMENT_REMNANTS_II, 1);
						st.playSound(SOUND_ITEMGET);
						if(st.getQuestItemsCount(TOURNAMENT_REMNANTS_II) == 5L)
						{
							st.setCond(2);
							st.playSound(SOUND_MIDDLE);
						}
					}
				}
			}
			}
			
			@Override
			public boolean checkStartCondition(Player player)
			{
			if(player == null || player.getClan() == null || player.getClan().getLevel() <= 3)
				return false;
			return super.checkStartCondition(player);
			}
			
			}*/