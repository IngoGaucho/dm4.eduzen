package de.deepamehta.plugins.eduzen.service;

import de.deepamehta.core.Topic;
import de.deepamehta.core.RelatedTopic;
import de.deepamehta.core.ResultSet;
import de.deepamehta.core.model.TopicModel;
import de.deepamehta.core.service.ClientState;
import de.deepamehta.core.service.PluginService;
import de.deepamehta.plugins.eduzen.model.Resource;
import de.deepamehta.plugins.eduzen.model.ResourceTopic;

public interface EduzenService extends PluginService {

  Resource createContent(ResourceTopic topic, ClientState clientState);
  
  // Queries for correctors ...

  ResultSet<Topic> getAllExercises(ClientState clientState);

  ResultSet<Topic> getAllNewExercises(ClientState clientState);
  
  ResultSet<Topic> getAllUncommentedExercises(ClientState clientState);
  
  ResultSet<Topic> getAllUnapproachedExercises(ClientState clientState);

  String getApproachState(long approachId, ClientState clientState);
  
  String getExerciseState(long exerciseId, ClientState clientState);

  String getExerciseTextState(long exerciseTextId, ClientState clientState);

  ResultSet<RelatedTopic> getExerciseObjects(long exerciseTextId, ClientState clientState);

}
