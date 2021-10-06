import React from 'react';

const About = () => {
    return (
        <div className="row align-items-center">
            
            <div class="about-section">
  <h1>About Us Page</h1>
  <p>Some text about who we are and what we do.</p>
  <p>Resize the browser window to see that this page is responsive by the way.</p>
</div>

<h2 /* style="text-align:center" */>Our Team</h2>
<div class="row">
  <div class="column">
    <div class="card">
      <img src="/profil.png" alt="Jane" /* style="width:100%" *//>
      <div class="container">
        <h2>Jane Doe</h2>
        <p class="title">CEO & Founder</p>
        <p>Some text that describes me lorem ipsum ipsum lorem.</p>
        <p>jane@example.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>

  <div class="column">
    <div class="card">
      <img src="/profil.png" alt="Mike" /* style="width:100%" *//>
      <div class="container">
        <h2>Mike Ross</h2>
        <p class="title">Art Director</p>
        <p>Some text that describes me lorem ipsum ipsum lorem.</p>
        <p>mike@example.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>

  <div class="column">
    <div class="card">
      <img src="/profil.png" alt="John" /* style={{ width:100%}} *//>
      <div class="container">
        <h2>John Doe</h2>
        <p class="title">Designer</p>
        <p>Some text that describes me lorem ipsum ipsum lorem.</p>
        <p>john@example.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>
</div>
         <div className="col-md-12 home-right">
           <img src="/home.png" alt="Home banner"></img>
        </div> 
    </div>
    );
};

export default About;