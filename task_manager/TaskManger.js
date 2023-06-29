import React, { useState } from 'react';
import TicketForm from './TicketForm';
import TicketList from './TicketList';

// ticket manager should be conntected to database like mongoDB - mongodb+srv://norman:<password>@cluster0.f0bke.mongodb.net/
/*in this project we using web cluster named FINALSTORE 
Version
6.0.6
REGION
AWS / Ireland (eu-west-1)
CLUSTER TIER
M0 Sandbox (General) */

const TicketManager = () => {
  const [tickets, setTickets] = useState([]);

  /* 
  additionall value can be: 
  assignee: '' to assign a person in team, 
  status: '' to update status 
  */

  const newTickets = () => {
    const projectTickets = [
      {
        id: 1,
        title: 'Setting up Backend Project',
        description: 'Creating a new Spring Boot project',
        priority: 'High',
        duration: 4
      },
      {
        id: 2,
        title: 'Implementing User Authentication',
        description: 'Implementing user authentication and authorization',
        priority: 'Medium',
        duration: 4
      },
      {
        id: 3,
        title: 'Designing Database Schema',
        description: 'Designing the database schema for the application',
        priority: 'High',
        duration: 6
      },
      {
        id: 4,
        title: 'Building REST API Endpoints',
        description: 'Building the REST API endpoints for data retrieval',
        priority: 'Medium',
        duration: 10
      },
      {
        id: 5,
        title: 'Developing Angular Frontend',
        description: 'Developing the frontend using Angular framework',
        priority: 'High',
        duration: 5
      },
      {
        id: 6,
        title: 'Writing Unit Tests',
        description: 'Writing unit tests for backend components',
        priority: 'Medium',
        duration: 9
      },
      {
        id: 7,
        title: 'Implementing Data Validation',
        description: 'Implementing data validation and error handling',
        priority: 'High',
        duration: 7
      },
      {
        id: 8,
        title: 'Integrating External API',
        description: 'Integrating external API for additional functionality',
        priority: 'Medium',
        duration: 5
      },
      {
        id: 9,
        title: 'Refactoring Code',
        description: 'Refactoring and optimizing existing codebase',
        priority: 'High',
        duration: 9
      },
      {
        id: 10,
        title: 'Deploying to Production',
        description: 'Preparing the application for deployment to production environment',
        priority: 'Medium',
        duration: 6
      }
    ];

    setTickets(projectTickets);
  };

  const addTicket = (ticketName) => {
    setTickets([...tickets, ticketName]);
  };

  return (
    <div>
      <TicketForm addTicket={addTicket} />
      <TicketList tickets={tickets} />
      <button onClick={newTickets}>Project Tickets</button>
    </div>
  );
};

export default TicketManager;