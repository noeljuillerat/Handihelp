import styled from "styled-components";

export const Box = styled.div`
  background: #191919;
  position: absolute;
  bottom: 0;
  width: 100%;

  @media (max-width: 1000px) {
    padding: 70px 30px;
  }
`;

export const Container = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  max-width: 1000px;
  margin: 0 auto;
  background: #faf4f498;
  border-radius: 15px;
  border: 1px solid #ff9802;
`;

export const Column = styled.div`
  display: flex;
  flex-direction: column;
  text-align: left;
  margin-left: 60px;
`;

export const Row = styled.div`
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(185px, 1fr));
  grid-gap: 20px;

  @media (max-width: 1000px) {
    grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
  }
`;

export const FooterLink = styled.a`
  color: #191919;
  margin-bottom: 20px;
  font-size: 18px;
  text-decoration: none;

  &:hover {
    color: #ff9802;
    transition: 200ms ease-in;
  }
`;

export const Heading = styled.p`
  text-decoration: underline orange;
  font-size: 24px;
  padding-top: 10px;
  color: black;
  margin-bottom: 40px;
  font-weight: bold;
`;
