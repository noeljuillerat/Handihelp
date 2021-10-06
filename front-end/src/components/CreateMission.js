import React from "react";

const CreateMission = () => {
  return (
    <div>
      <section>
        <form action="post">
          <input type="text" name="titre" placeholder="Titre de la mission" />
          <input type="text" name="lieu" placeholder="Lieu" />
          <input type="date" name="date" placeholder="Date" />
          <input type="text" name="duree" placeholder="Durée de la mission" />
          <textarea
            name="description"
            id=""
            cols="30"
            rows="10"
            placeholder="Description de la mission"
          ></textarea>
          <button type="submit">Valider</button>
        </form>
      </section>
    </div>
  );
};

export default CreateMission;
